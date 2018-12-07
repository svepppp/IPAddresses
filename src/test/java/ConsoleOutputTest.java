import model.Diapason;
import org.junit.Test;

import java.io.*;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ConsoleOutputTest {

    @Test
    public void testShowAllIpAddresses() throws IOException {
        Diapason diapason = new Diapason("192.168.0.5", "192.168.0.08");
        List<String> allIpAddresses = diapason.getAllIpAddresses();
        try (PrintWriter out = new PrintWriter(new FileWriter("addresses.txt"))) {
            out.println("Все  IP адреса");

            for (String allIpAddress : allIpAddresses) {
                out.println(allIpAddress);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader in = new BufferedReader(new FileReader("addresses.txt"));
        String line1 = in.readLine();
        String line2 = in.readLine();
        String line3 = in.readLine();

        assertEquals("Все  IP адреса", line1);
        assertEquals("192.168.0.6", line2);
        assertEquals("192.168.0.7", line3);
    }
}

