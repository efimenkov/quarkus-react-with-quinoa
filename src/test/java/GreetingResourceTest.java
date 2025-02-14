import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class GreetingResourceTest {

    @Test
    void hello() {
        GreetingResource greetingResource = new GreetingResource();
        assertEquals("hello", greetingResource.hello());
    }
}