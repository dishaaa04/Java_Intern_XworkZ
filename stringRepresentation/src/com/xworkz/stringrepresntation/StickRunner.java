package com.xworkz.stringrepresntation;

public class StickRunner {
    public static void main(String[] args) {
        Stick stick1 = new Stick();
        stick1.setType("Walking");
        stick1.setLength(100.0);
        stick1.setColor("Brown");

        Stick stick2 = new Stick();
        stick2.setType("Walking");
        stick2.setLength(100.0);
        stick2.setColor("Brown");

        System.out.println("Checking same location: " + (stick1 == stick2));
        boolean same = stick1.equals(stick2);
        System.out.println("stick1 is same as stick2: " + same);
    }
}
