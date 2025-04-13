package com.xworkz.stringrepresntation;

public class ZooRunner {
    public static void main(String[] args) {
        Zoo z1 = new Zoo();
        z1.setCity("Mysuru");

        Zoo z2 = new Zoo();
        z2.setCity("Mysuru");

        System.out.println("Checking same location: " + (z1 == z2));
        boolean same = z1.equals(z2);
        System.out.println("z1 is same as z2: " + same);
    }
}
