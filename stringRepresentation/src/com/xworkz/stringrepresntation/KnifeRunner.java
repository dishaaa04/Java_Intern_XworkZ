package com.xworkz.stringrepresntation;

public class KnifeRunner {
    public static void main(String[] args) {

        Knife knife1 = new Knife();
        knife1.setType("Chef");
        knife1.setMaterial("Steel");

        Knife knife2 = new Knife();
        knife2.setType("Chef");
        knife2.setMaterial("Steel");

        System.out.println("Checking same location: " + (knife1 == knife2));
        boolean same = knife1.equals(knife2);
        System.out.println("knife1 is same as knife2: " + same);
    }
}
