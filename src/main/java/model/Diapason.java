package model;

import java.util.ArrayList;
import java.util.List;

public class Diapason {
    private IpAddress ipAddress1;
    private IpAddress ipAddress2;
    private List<String> allIpAddresses;

    public Diapason() {
    }

    public IpAddress getIpAddress1() {
        return ipAddress1;
    }

    public IpAddress getIpAddress2() {
        return ipAddress2;
    }

    public void setIpAddress1(IpAddress ipAddress1) {
        this.ipAddress1 = ipAddress1;
    }

    public void setIpAddress2(IpAddress ipAddress2) {
        this.ipAddress2 = ipAddress2;
    }

    public void setAllIpAddresses(List<String> allIpAddresses) {
        this.allIpAddresses = allIpAddresses;
    }

    public List<String> getAllIpAddresses(IpAddress ipAddress1, IpAddress ipAddress2) {
        List<String> allNumbers = getAllNumbers(ipAddress1, ipAddress2);
        allIpAddresses = new ArrayList<>();
        int indexPoint = ipAddress1.getIndexPoint();
        String temp = ipAddress1.getValue().substring(0, indexPoint + 1);

        for (int i = 0; i < allNumbers.size(); i++) {
            allIpAddresses.add(temp + allNumbers.get(i));
        }
        return allIpAddresses;
    }

    private List<String> getAllNumbers(IpAddress ipAddress1, IpAddress ipAddress2) {
        List<String> allNumbers = new ArrayList<>();
        int number = ipAddress1.getNumber(ipAddress1.getValue());
        int difference = getDifference(ipAddress1, ipAddress2);

        for (int i = 0; i < difference; i++) {
            number = number + 1;
            String numberString = String.valueOf(number);
            allNumbers.add(numberString);
        }
        return allNumbers;
    }

    private int getDifference(IpAddress ipAddress1, IpAddress ipAddress2) {
        int number1 = ipAddress1.getNumber(ipAddress1.getValue());
        int number2 = ipAddress2.getNumber(ipAddress2.getValue());
        int difference=number2 - number1 - 1;
        return difference;
    }
}
