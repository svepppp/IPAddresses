package controller;

import model.IpAddress;
import view.AllIpAddressesWindow;
import view.IpAddressWindow;

public class Main {
    public static void main(String[] args) {
        IpAddress ipAddress=new IpAddress("192.168.0.2");
       // System.out.println(ipAddress.getValue());
        IpAddressWindow ipAddressWindow=new IpAddressWindow();

    }
}
