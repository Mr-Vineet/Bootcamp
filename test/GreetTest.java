import com.tw.dummy.Greet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetTest {
    @Test
    void testGreetHello(){
        final Greet greet = new Greet();
        assertEquals("Hello", greet.hello());
    }

    @Test
    void testGreetHi(){
        final Greet greet = new Greet();
        assertEquals("Hi", greet.hi());
    }

    @Test
    void testGreetAny() {
        final Greet greet = new Greet();
        assertEquals("Hello World", greet.any("Hello World"));
    }
}