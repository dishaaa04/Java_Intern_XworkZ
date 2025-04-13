package com.xworkz.stringrepresntation;

public class BottleRunner {
    public static void main(String[] args) {

        Bottle bottle1 = new Bottle();
        bottle1.setMaterial("Plastic");

        Bottle bottle2 = new Bottle();
        bottle2.setMaterial("Plastic");

        System.out.println("Checking same location: " + (bottle1 == bottle2));
        System.out.println("bottle1 is same as bottle2: " + bottle1.equals(bottle2));
    }
}
