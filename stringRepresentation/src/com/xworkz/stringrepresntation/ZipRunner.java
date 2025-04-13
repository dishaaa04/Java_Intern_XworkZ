package com.xworkz.stringrepresntation;

public class ZipRunner {
    public static void main(String[] args) {
        Zip z1 = new Zip();
        z1.setType("Plastic");

        Zip z2 = new Zip();
        z2.setType("Plastic");

        System.out.println("Checking same location: " + (z1 == z2));
        boolean same = z1.equals(z2);
        System.out.println("z1 is same as z2: " + same);
    }
}
