import org.junit.Test;
import view.ConsoleInput;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class ConsoleInputTest {

    @Test
    public void testGetValues() throws UnsupportedEncodingException {
        String mockInput = "192.168.0.5\n192.168.0.15";
        InputStream mockInputStrim = new ByteArrayInputStream(mockInput.getBytes(StandardCharsets.UTF_8.name()));
        ConsoleInput consoleInput = new ConsoleInput(mockInputStrim);
        String[] values = consoleInput.getValues();
        assertEquals("192.168.0.5", values[0]);
        assertEquals("192.168.0.15", values[1]);
    }
}
