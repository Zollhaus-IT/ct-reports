package org.acme;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.net.URI;
import java.util.List;

@Path("/persons")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PersonResource {

    @Inject
    PersonRepository personRepository;

    @GET
    public List<Person> list() {
        return personRepository.listAll();
    }

    @GET
    @Path("/{id}")
    public Person get(Long id) {
        return personRepository.findById(id);
    }

    @POST
    @Transactional
    public Response create(Person person) {
        personRepository.persist(person);
        return Response.created(URI.create("/persons/" + person.getId())).build();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void delete(Long id) {
        Person entity = personRepository.findById(id);
        if(entity == null) {
            throw new NotFoundException();
        }
        personRepository.delete(entity);
    }

    @GET
    @Path("/count")
    public Long count() {
        return personRepository.count();
    }
}