package ch.zollhaus.domain.service;

import java.util.concurrent.TimeUnit;

import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.zollhaus.adapter.mapping.persons.PersonsResponse;
import ch.zollhaus.adapter.out.CtApiPersonClient;
import ch.zollhaus.app.repos.PersonsRepository;
import ch.zollhaus.domain.groups.Person;
import io.quarkus.runtime.Startup;
import io.quarkus.scheduler.Scheduled;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

import static io.quarkus.scheduler.Scheduled.ConcurrentExecution.SKIP;

@Startup
@Singleton
public class PersonScraper {

   private static final Logger LOG = LoggerFactory.getLogger(GroupScraper.class);
   private static final String PERSONS_PAGE_SIZE = "200"; // 200 is the max page size

   @Inject
   @RestClient
   CtApiPersonClient ctApiPersonClient;

   @Inject
   PersonsRepository personsRepository;

   @ConfigProperty(name = "ct.logintoken")
   String ctLoginToken;

   @Scheduled(every = "1m", delay = 10, delayUnit = TimeUnit.SECONDS, concurrentExecution = SKIP)
   public void scrapePersons() {
      int pageNumber = 1;
      PersonsResponse response;

      do {
         response = ctApiPersonClient.getPersons(
               ctLoginToken,
               PERSONS_PAGE_SIZE,
               String.valueOf(pageNumber));

         if (response != null && !response.getData().isEmpty()) {
            response.getData().forEach(dataItem -> {
               Person person = new Person(
                     dataItem.getId() + "",
                     dataItem.getFirstName(),
                     dataItem.getLastName(),
                     dataItem.getBirthday(),
                     dataItem.getStreet(),
                     dataItem.getAddressAddition(),
                     dataItem.getZip(),
                     dataItem.getCity(),
                     dataItem.getCountry(),
                     dataItem.getSexId());
               personsRepository.create(person);
               LOG.info("Scraped person: " + dataItem.getId());
            });
            pageNumber++;
         }
      } while (response != null && !response.getData().isEmpty());
   }
}
