package com.boot.spring;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by darlan on 02/02/17.
 */
@Path("/persons")
public interface Persons {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Response list();

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    Response post(final Person person);

}
