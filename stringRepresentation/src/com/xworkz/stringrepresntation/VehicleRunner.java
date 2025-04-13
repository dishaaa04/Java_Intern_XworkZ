package com.xworkz.stringrepresntation;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.setType("SUV");

        Vehicle v2 = new Vehicle();
        v2.setType("SUV");

        System.out.println("Checking same location: " + (v1 == v2));
        boolean same = v1.equals(v2);
        System.out.println("v1 is same as v2: " + same);
    }
}
