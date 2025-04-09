package com.xworkz.stringrepresntation;

public class BusRunner {
    public static void main(String[] args) {
        Bus bus = new Bus("Route 101", 50, "Ravi Kumar");
        System.out.println("bus" + bus.toString());
    }
}
