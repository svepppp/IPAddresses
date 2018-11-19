import model.Diapason;
import model.IpAddress;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class DiapasonTest {

    @Test
    public void testGetDifference() {
        Diapason diapason = new Diapason("192.168.0.5", "192.168.0.14");

        IpAddress ipAddress1 = diapason.getIpAddress1();
        IpAddress ipAddress2 = diapason.getIpAddress2();

        int number1 = ipAddress1.getNumber();
        int number2 = ipAddress2.getNumber();
        int difference = number2 - number1 - 1;
        assertEquals(8, difference);
    }

    @Test
    public void testGetAllNumbers() {
        Diapason diapason = new Diapason("192.168.0.5", "192.168.0.14");

        IpAddress ipAddress1 = diapason.getIpAddress1();
        IpAddress ipAddress2 = diapason.getIpAddress2();

        List<String> allNumbers = new ArrayList<>();
        int number = ipAddress1.getNumber();
        int number1 = ipAddress1.getNumber();
        int number2 = ipAddress2.getNumber();
        int difference = number2 - number1 - 1;

        for (int i = 0; i < difference; i++) {
            number = number + 1;
            String numberString = String.valueOf(number);
            allNumbers.add(numberString);
            assertEquals(number1 + 1 + i, number);
        }
        assertEquals("6", allNumbers.get(0));
        assertEquals("13", allNumbers.get(7));
    }

    @Test
    public void testGetAllIpAddresses() {
        Diapason diapason = new Diapason("192.168.0.5", "192.168.0.14");

        IpAddress ipAddress1=diapason.getIpAddress1();
        IpAddress ipAddress2=diapason.getIpAddress2();
        List<String> allIpAddresses=diapason.getAllIpAddresses(ipAddress1,ipAddress2);

        assertEquals("192.168.0.6", allIpAddresses.get(0));
        assertEquals("192.168.0.13", allIpAddresses.get(7));

    }
}
