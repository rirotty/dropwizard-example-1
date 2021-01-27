package leanix.net.core;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GreetingServiceTest {

    @Test
    void greeting() {
        final GreetingService greetingService = new GreetingService();
        final String greeting = greetingService.greeting();
        assertThat(greeting).isEqualTo("Hello LeanIx!!");
    }
}