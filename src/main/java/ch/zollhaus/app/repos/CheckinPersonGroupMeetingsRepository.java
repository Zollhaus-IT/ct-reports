package ch.zollhaus.app.repos;

import ch.zollhaus.domain.groups.meetings.CheckinPersonGroupMeetings;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class CheckinPersonGroupMeetingsRepository implements PanacheRepository<CheckinPersonGroupMeetings> {

    @Override
    @Transactional
    public void persist(CheckinPersonGroupMeetings checkinPersonGroupMeetings) {
        PanacheRepository.super.persist(checkinPersonGroupMeetings);
    }
}
