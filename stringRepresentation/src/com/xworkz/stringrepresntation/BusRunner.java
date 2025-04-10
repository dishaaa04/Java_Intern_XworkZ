package com.xworkz.stringrepresntation;

public class BusRunner {
    public static void main(String[] args) {
        Bus bus = new Bus("KA-01-F-1234", 50, "Majestic to Electronic City");
        System.out.println("bus = " + bus.toString());

        int code = bus.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("ticket = " + "ticket".hashCode());
        System.out.println("driver = " + "driver".hashCode());
        System.out.println("passenger = " + "passenger".hashCode());
    }
}
