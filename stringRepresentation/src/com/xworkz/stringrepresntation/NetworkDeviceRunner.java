package com.xworkz.stringrepresntation;

public class NetworkDeviceRunner {
    public static void main(String[] args) {
        NetworkDevice device = new NetworkDevice("Router", "192.168.1.1", true);
        System.out.println("networkDevice = " + device.toString());

        int code = device.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("modem = " + "modem".hashCode());
        System.out.println("ethernet = " + "ethernet".hashCode());
        System.out.println("ping = " + "ping".hashCode());
    }
}
