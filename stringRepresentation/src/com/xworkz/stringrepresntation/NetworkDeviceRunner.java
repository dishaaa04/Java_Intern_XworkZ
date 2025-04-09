package com.xworkz.stringrepresntation;

public class NetworkDeviceRunner {
    public static void main(String[] args) {
        NetworkDevice device = new NetworkDevice("Cisco Switch", "192.168.1.1", true);
        System.out.println("networkDevice" + device.toString());
    }
}
