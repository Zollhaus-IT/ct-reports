package ch.zollhaus.adapter.out;

import ch.zollhaus.adapter.mapping.gmidpr.DataItem;
import ch.zollhaus.adapter.mapping.gmidpr.GroupMeetingPersonResponse;
import ch.zollhaus.adapter.mapping.gmidr.GroupMeetingIdResponse;
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

import java.util.ArrayList;
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

    @ConfigProperty(name = "ct.api.group.id")
    String groupId;

    @ConfigProperty(name = "ct.logintoken")
    String loginToken;

    @Scheduled(every = "50m", delay = 500, delayUnit = TimeUnit.SECONDS, concurrentExecution = SKIP)
    public void crawlGroups() {
        GroupMeetingResponse groupMeetingResponse = ctApiGroupClient.getGroupMeetings(loginToken, groupId, "2023-01-01", "2024-02-25", null,  null);
        List<Integer> meetingIds = new ArrayList<>(groupMeetingResponse.getData().stream()
                .map(ch.zollhaus.adapter.mapping.gmr.DataItem::getId)
                .toList());

        for (Integer meetingId : meetingIds) {
            crawlGroupMeetingPersons(groupId, meetingId.toString());
        }
        LOG.debug("Processed {} meetings for group {}", meetingIds.size(), groupId);
    }

    private void crawlGroupMeetingPersons(String groupId, String meetingId) {
        GroupMeetingPersonResponse groupMeetingPersonResponse = ctApiGroupClient.getCheckinData(loginToken, groupId, meetingId);
        LOG.debug("retrieved {} persons for meeting {}",
                groupMeetingPersonResponse.getData().size(),
                meetingId
        );

        GroupMeetingIdResponse groupMetaData = ctApiGroupClient.getSpecificGroupMeeting(loginToken, groupId, meetingId);
        LOG.debug("retrieved metadata for meeting {}",
                meetingId);

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
                groupMetaData.getData().getDateFrom(),
                checkedInPersonsParticipantsCount,
                checkedInPersonsLeadersCount,
                notCheckedInPersonsCount
        );

        checkinPersonGroupMeetingsRepository.createOrOverwrite(checkinPersonGroupMeeting);
    }

}
