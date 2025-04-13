package com.xworkz.stringrepresntation;

public class ZebraRunner {
    public static void main(String[] args) {
        Zebra z1 = new Zebra();
        z1.setOrigin("Africa");

        Zebra z2 = new Zebra();
        z2.setOrigin("Africa");

        System.out.println("Checking same location: " + (z1 == z2));
        boolean same = z1.equals(z2);
        System.out.println("z1 is same as z2: " + same);
    }
}
