package com.xworkz.stringrepresntation;

public class BusRunner {
    public static void main(String[] args) {

        Bus bus1 = new Bus();
        bus1.setRoute("Route 101");

        Bus bus2 = new Bus();
        bus2.setRoute("Route 101");

        System.out.println("Checking same location: " + (bus1 == bus2));
        boolean same = bus1.equals(bus2);
        System.out.println("bus1 is same as bus2: " + same);
    }
}
