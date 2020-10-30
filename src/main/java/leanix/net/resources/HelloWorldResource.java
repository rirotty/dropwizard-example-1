package leanix.net.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class HelloWorldResource {

    @GET
    public Response createConfiguration() {
        return Response.ok("Hello World!").build();
    }
}
