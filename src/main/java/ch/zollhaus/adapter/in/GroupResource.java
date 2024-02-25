package ch.zollhaus.adapter.in;

import ch.zollhaus.app.repos.CheckinPersonGroupMeetingsRepository;
import ch.zollhaus.domain.groups.meetings.CheckinPersonGroupMeetings;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/ctreports/groups")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GroupResource {

    @Inject
    CheckinPersonGroupMeetingsRepository repository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CheckinPersonGroupMeetings> list() {
        return repository.listAll();
    }
}
