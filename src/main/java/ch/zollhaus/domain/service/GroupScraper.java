package ch.zollhaus.domain.service;

import ch.zollhaus.adapter.mapping.groups.GroupsResponse;
import ch.zollhaus.adapter.out.CtApiGroupClient;
import ch.zollhaus.app.repos.GroupsRepository;
import ch.zollhaus.domain.groups.Group;
import io.quarkus.runtime.Startup;
import io.quarkus.scheduler.Scheduled;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

import static io.quarkus.scheduler.Scheduled.ConcurrentExecution.SKIP;

@Startup
@Singleton
public class GroupScraper {

    private static final Logger LOG = LoggerFactory.getLogger(GroupScraper.class);
    private static final String GROUPS_PAGE_SIZE = "200"; // 200 is the max page size

    @Inject
    ConfigService configService;

    @Inject
    @RestClient
    CtApiGroupClient ctApiGroupClient;

    @Inject
    GroupsRepository groupsRepository;

    @ConfigProperty(name = "ct.logintoken")
    String ctLoginToken;

    @Scheduled(every = "1m", delay = 10, delayUnit = TimeUnit.SECONDS, concurrentExecution = SKIP)
    public void scrapeGroups() {

        // retrieve all groups from target API via CtApiGroupClient. Stop when response is empty.
        int pageNumber = 1;
        GroupsResponse response;

        do {
            response = ctApiGroupClient.getGroups(
                    ctLoginToken,
                    GROUPS_PAGE_SIZE,
                    String.valueOf(pageNumber)
            );

            if (response != null && !response.getData().isEmpty()) {
                response.getData().forEach(dataItem -> {
                    Group group = new Group(
                            dataItem.getName(),
                            String.valueOf(dataItem.getId()),
                            String.valueOf(dataItem.getInformation().getGroupTypeId())
                    );
                    groupsRepository.create(group);
                    LOG.info("Scraped group: " + dataItem.getName());
                });
                pageNumber++;
            }
        } while (response != null && !response.getData().isEmpty());


    }
}
