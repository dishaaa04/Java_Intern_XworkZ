package com.xworkz.stringrepresntation;

public class CylinderRunner {
    public static void main(String[] args) {

        Cylinder cylinder1 = new Cylinder();
        cylinder1.setGasType("LPG");

        Cylinder cylinder2 = new Cylinder();
        cylinder2.setGasType("LPG");

        System.out.println("Checking same location: " + (cylinder1 == cylinder2));
        boolean same = cylinder1.equals(cylinder2);
        System.out.println("cylinder1 is same as cylinder2: " + same);
    }
}
