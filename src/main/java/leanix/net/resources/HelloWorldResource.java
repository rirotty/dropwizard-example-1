package leanix.net.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import leanix.net.core.GreetingService;

@Path("/")
public class HelloWorldResource {

    private final GreetingService greetingService;

    public HelloWorldResource(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GET
    public Response createConfiguration() {
        return Response.ok(greetingService.greeting()).build();
    }
}
