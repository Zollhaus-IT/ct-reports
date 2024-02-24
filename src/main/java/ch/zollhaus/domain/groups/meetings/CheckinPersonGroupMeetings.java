package ch.zollhaus.domain.groups.meetings;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import static jakarta.persistence.GenerationType.SEQUENCE;

@Entity(name = "checkin_person_group_meetings")
public class CheckinPersonGroupMeetings{

    @Id @GeneratedValue(strategy=SEQUENCE, generator="CUST_SEQ")
    private Long id;
    @Column(name = "meeting_date_time")
    private String meetingDateTime;
    @Column(name = "meeting_id")
    private String meetingId;
    @Column(name = "group_id")
    private String groupId;
    @Column(name = "checked_in_role_id_participants")
    private int checkedInRoleIdParticipants;
    @Column(name = "checked_in_role_id_leaders")
    private int checkedInRoleIdLeaders;
    @Column(name = "not_checked_in")
    private int notCheckedIn;

    public CheckinPersonGroupMeetings(String meetingId, String groupId, String meetingDateTime, int checkedInRoleIdParticipants, int checkedInRoleIdLeaders, int notCheckedIn) {
        this.meetingId = meetingId;
        this.groupId = groupId;
        this.meetingDateTime = meetingDateTime;
        this.checkedInRoleIdParticipants = checkedInRoleIdParticipants;
        this.checkedInRoleIdLeaders = checkedInRoleIdLeaders;
        this.notCheckedIn = notCheckedIn;
    }

    public CheckinPersonGroupMeetings() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getMeetingDateTime() {
        return meetingDateTime;
    }

    public void setMeetingDateTime(String meetingDateTime) {
        this.meetingDateTime = meetingDateTime;
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getCheckedInRoleIdParticipants() {
        return checkedInRoleIdParticipants;
    }

    public void setCheckedInRoleIdParticipants(int checkedInRoleIdParticipants) {
        this.checkedInRoleIdParticipants = checkedInRoleIdParticipants;
    }

    public int getCheckedInRoleIdLeaders() {
        return checkedInRoleIdLeaders;
    }

    public void setCheckedInRoleIdLeaders(int checkedInRoleIdLeaders) {
        this.checkedInRoleIdLeaders = checkedInRoleIdLeaders;
    }

    public int getNotCheckedIn() {
        return notCheckedIn;
    }

    public void setNotCheckedIn(int notCheckedIn) {
        this.notCheckedIn = notCheckedIn;
    }
}
