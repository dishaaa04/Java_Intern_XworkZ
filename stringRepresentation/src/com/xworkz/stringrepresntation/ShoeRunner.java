package com.xworkz.stringrepresntation;

public class ShoeRunner {
    public static void main(String[] args) {
        Shoe shoe1 = new Shoe();
        shoe1.setBrand("Nike");
        shoe1.setSize(42.5);
        shoe1.setColor("Black");

        Shoe shoe2 = new Shoe();
        shoe2.setBrand("Nike");
        shoe2.setSize(42.5);
        shoe2.setColor("Black");

        System.out.println("Checking same location: " + (shoe1 == shoe2));
        boolean same = shoe1.equals(shoe2);
        System.out.println("shoe1 is same as shoe2: " + same);
    }
}
