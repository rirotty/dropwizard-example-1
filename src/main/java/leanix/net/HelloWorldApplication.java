package leanix.net;

import io.dropwizard.Application;
import io.dropwizard.configuration.EnvironmentVariableSubstitutor;
import io.dropwizard.configuration.SubstitutingSourceProvider;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import leanix.net.core.GreetingService;
import leanix.net.resources.HelloWorldResource;

public class HelloWorldApplication extends Application<AppConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloWorldApplication().run(args);
    }

    @Override
    public String getName() {
        return "dropwizard_example";
    }

    @Override
    public void initialize(final Bootstrap<AppConfiguration> bootstrap) {
        // Enable variable substitution with environment variables
        bootstrap.setConfigurationSourceProvider(
            new SubstitutingSourceProvider(
                bootstrap.getConfigurationSourceProvider(),
                new EnvironmentVariableSubstitutor(false)
            )
        );
    }

    @Override
    public void run(final AppConfiguration configuration,
                    final Environment environment) {
        environment.jersey().register(new HelloWorldResource(new GreetingService()));
    }

}
