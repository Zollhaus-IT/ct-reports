package ch.zollhaus.adapter.out;

import ch.zollhaus.adapter.mapping.gmpr.GroupMeetingPersonResponse;
import ch.zollhaus.adapter.mapping.gmr.GroupMeetingResponse;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;


@RegisterRestClient(baseUri = "https://czz.church.tools/api/groups")
public interface CtApiGroupClient {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{groupId}/meetings")
    GroupMeetingResponse getGroupMeetings(@QueryParam("login_token") String token, @PathParam("groupId") String groupId);

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{groupId}/meetings/{meetingId}/members")
    GroupMeetingPersonResponse getCheckinData(@QueryParam("login_token") String token, @PathParam ("groupId") String groupId, @PathParam("meetingId") String meetingId);

}
