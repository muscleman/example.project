import org.junit.Test;

import static org.junit.Assert.*;

public class TalkTest {
    @Test
    public void sayHello() throws Exception {

        String message = "Hello";
        Talk t = new Talk(message);

        String result = t.SayHello();

        assertSame(message, result);


    }

}