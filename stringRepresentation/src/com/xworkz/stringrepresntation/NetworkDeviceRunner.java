package com.xworkz.stringrepresntation;

public class NetworkDeviceRunner {
    public static void main(String[] args) {
        NetworkDevice device1 = new NetworkDevice();
        device1.setName("Router");
        device1.setIpAddress("192.168.0.1");

        NetworkDevice device2 = new NetworkDevice();
        device2.setName("Router");
        device2.setIpAddress("192.168.0.1");

        System.out.println("Checking same location: " + (device1 == device2));
        boolean same = device1.equals(device2);
        System.out.println("device1 is same as device2: " + same);
    }
}
