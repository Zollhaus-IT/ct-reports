package ch.zollhaus.app.repos;

import ch.zollhaus.domain.groups.meetings.CheckinPersonGroupMeetings;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.logging.Log;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class CheckinPersonGroupMeetingsRepository implements PanacheRepository<CheckinPersonGroupMeetings> {

    /**
     * Persists the CheckinPersonGroupMeetings object if it does not exist, or updates it if it does.
     * @param checkinPersonGroupMeetings the CheckinPersonGroupMeetings object to persist or update
     */
    @Transactional
    public void createOrOverwrite(CheckinPersonGroupMeetings checkinPersonGroupMeetings) {
        List<CheckinPersonGroupMeetings> checkinPersonGroupMeetingsList = find("meetingId", checkinPersonGroupMeetings.getMeetingId()).list();

        if (checkinPersonGroupMeetingsList.isEmpty()) {
            persist(checkinPersonGroupMeetings);
            Log.info("Persisted CheckinPersonGroupMeetings with meetingId: " + checkinPersonGroupMeetings.getMeetingId());
        } else {
            CheckinPersonGroupMeetings updatedCheckinPersonGroupMeetings = checkinPersonGroupMeetingsList.get(0);
            updatedCheckinPersonGroupMeetings.setMeetingId(checkinPersonGroupMeetings.getMeetingId());
            updatedCheckinPersonGroupMeetings.setGroupId(checkinPersonGroupMeetings.getGroupId());
            updatedCheckinPersonGroupMeetings.setMeetingDateTime(checkinPersonGroupMeetings.getMeetingDateTime());
            updatedCheckinPersonGroupMeetings.setCheckedInRoleIdLeaders(checkinPersonGroupMeetings.getCheckedInRoleIdLeaders());
            updatedCheckinPersonGroupMeetings.setCheckedInRoleIdParticipants(checkinPersonGroupMeetings.getCheckedInRoleIdParticipants());
            updatedCheckinPersonGroupMeetings.setNotCheckedIn(checkinPersonGroupMeetings.getNotCheckedIn());
            persist(checkinPersonGroupMeetingsList.get(0));
            Log.info("Updated CheckinPersonGroupMeetings with meetingId: " + checkinPersonGroupMeetings.getMeetingId());
        }
    }

    public List<CheckinPersonGroupMeetings> getAll() {
        return listAll();
    }
}
