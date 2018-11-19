import model.IpAddress;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IpAddressTest {

    @Test
    public void testGetNumber() {
        IpAddress ipAddress = new IpAddress("192.168.0.5");
        int number = ipAddress.getNumber();
        assertEquals(5, number);
        assertEquals(9, ipAddress.getIndexPoint());
    }
}
