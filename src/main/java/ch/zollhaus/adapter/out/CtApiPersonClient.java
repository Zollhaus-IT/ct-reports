package ch.zollhaus.adapter.out;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import ch.zollhaus.adapter.mapping.persons.PersonsResponse;

@RegisterRestClient(baseUri = "https://czz.church.tools/api/persons")
public interface CtApiPersonClient {

   @GET
   @Consumes(MediaType.APPLICATION_JSON)
   PersonsResponse getPersons(
         @QueryParam("login_token") String token,
         @QueryParam("limit") String pageSize,
         @QueryParam("page") String pageNumber);
}
