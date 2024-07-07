package ch.zollhaus.adapter.out;

import ch.zollhaus.adapter.mapping.gmidpr.GroupMeetingPersonResponse;
import ch.zollhaus.adapter.mapping.gmidr.GroupMeetingIdResponse;
import ch.zollhaus.adapter.mapping.gmr.GroupMeetingResponse;
import ch.zollhaus.adapter.mapping.groups.GroupsResponse;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "https://czz.church.tools/api/groups")
public interface CtApiGroupClient {

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{groupId}/meetings")
    GroupMeetingResponse getGroupMeetings(
            @QueryParam("login_token") String token,
            @PathParam("groupId") String groupId,
            @QueryParam("start_date") String startDate,
            @QueryParam("end_date") String endDate,
            @QueryParam("is_canceled") Boolean isCanceled,
            @QueryParam("is_completed") Boolean isCompleted
    );

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{groupId}/meetings/{meetingId}")
    GroupMeetingIdResponse getSpecificGroupMeeting(
            @QueryParam("login_token") String token,
            @PathParam("groupId") String groupId,
            @PathParam("meetingId") String meetingId
    );

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{groupId}/meetings/{meetingId}/members")
    GroupMeetingPersonResponse getCheckinData(
            @QueryParam("login_token") String token,
            @PathParam ("groupId") String groupId,
            @PathParam("meetingId") String meetingId
    );

    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    GroupsResponse getGroups(
            @QueryParam("login_token") String token,
            @QueryParam("limit") String pageSize,
            @QueryParam("page") String pageNumber
    );
}
