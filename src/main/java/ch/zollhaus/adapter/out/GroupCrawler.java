package ch.zollhaus.adapter.out;

import ch.zollhaus.adapter.mapping.gmpr.DataItem;
import ch.zollhaus.adapter.mapping.gmpr.GroupMeetingPersonResponse;
import ch.zollhaus.adapter.mapping.gmr.GroupMeetingResponse;
import ch.zollhaus.app.repos.CheckinPersonGroupMeetingsRepository;
import ch.zollhaus.domain.groups.meetings.CheckinPersonGroupMeetings;
import io.quarkus.runtime.Startup;
import io.quarkus.scheduler.Scheduled;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static io.quarkus.scheduler.Scheduled.ConcurrentExecution.SKIP;

@Startup
@Singleton
public class GroupCrawler {

    private static final Logger LOG = LoggerFactory.getLogger(GroupCrawler.class);

    @RestClient
    CtApiGroupClient ctApiGroupClient;

    @Inject
    CheckinPersonGroupMeetingsRepository checkinPersonGroupMeetingsRepository;

    @ConfigProperty(name = "ct.api.group.meeting.id")
    String meetingId;

    @ConfigProperty(name = "ct.api.group.id")
    String groupId;

    @ConfigProperty(name = "ct.logintoken")
    String loginToken;

    @Scheduled(every = "1d", delay = 30, delayUnit = TimeUnit.SECONDS, concurrentExecution = SKIP)
    public void crawlGroups() {
        GroupMeetingResponse groupMeetingResponse = ctApiGroupClient.getGroupMeetings(loginToken, groupId);
        List<Integer> meetingIds = groupMeetingResponse.getData().stream()
                .map(ch.zollhaus.adapter.mapping.gmr.DataItem::getId)
                .toList();
        
    }

    @Scheduled(every = "30s", delay = 3, delayUnit = TimeUnit.SECONDS, concurrentExecution = SKIP)
    public void crawlGroupMeetingPersons() {
        GroupMeetingPersonResponse groupMeetingPersonResponse = ctApiGroupClient.getCheckinData(loginToken, groupId, meetingId);
        LOG.info("Crawled {} checkins for meeting {}",
                groupMeetingPersonResponse.getData().size(),
                meetingId
        );

        List<DataItem> checkedInPersons = groupMeetingPersonResponse.getData().stream()
                .filter(DataItem::isIsCheckedIn)
                .toList();

        int checkedInPersonsParticipantsCount = checkedInPersons.stream()
                .filter(dataItem -> dataItem.getMember().getGroupTypeRoleId() == 9)
                .toList()
                .size();

        int checkedInPersonsLeadersCount = checkedInPersons.stream()
                .filter(dataItem -> dataItem.getMember().getGroupTypeRoleId() != 9)
                .toList()
                .size();

        int notCheckedInPersonsCount = groupMeetingPersonResponse.getData().stream()
                .filter(dataItem -> !dataItem.isIsCheckedIn())
                .toList()
                .size();

        CheckinPersonGroupMeetings checkinPersonGroupMeeting = new CheckinPersonGroupMeetings(
                meetingId,
                groupId,
                "2021-10-10T10:00:00",
                checkedInPersonsParticipantsCount,
                checkedInPersonsLeadersCount,
                notCheckedInPersonsCount
        );

        checkinPersonGroupMeetingsRepository.persist(checkinPersonGroupMeeting);
    }

}
