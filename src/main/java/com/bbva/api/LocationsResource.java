package com.bbva.api;

import com.bbva.api.beans.Locations;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/locations")
public interface LocationsResource {
  @GET
  @Produces("application/json")
  Response generatedMethod1();

  @Path("/{id}")
  @GET
  @Produces("application/json")
  Locations generatedMethod2(@PathParam("id") int id);

  @Path("/{id}")
  @POST
  @Produces("application/json")
  Locations generatedMethod3(@PathParam("id") int id);
}
