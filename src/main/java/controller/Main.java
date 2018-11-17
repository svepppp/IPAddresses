package controller;

import model.Diapason;
import model.IpAddress;
import view.AllIpAddressesWindow;
import view.IpAddressWindow;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        IpAddress ipAddress1 = new IpAddress();
        IpAddress ipAddress2 = new IpAddress();
        IpAddressWindow ipAddressWindow = new IpAddressWindow();
        pause(15000);
        ipAddress1.setValue(ipAddressWindow.getValue1());
        ipAddress2.setValue(ipAddressWindow.getValue2());

        Diapason diapason = new Diapason();
        List<String> allIpAddresses = diapason.getAllIpAddresses(ipAddress1, ipAddress2);

        for (String allIpAddress : allIpAddresses) {
            System.out.println(allIpAddress);
        }
    }

    public static void pause(int delay) {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
