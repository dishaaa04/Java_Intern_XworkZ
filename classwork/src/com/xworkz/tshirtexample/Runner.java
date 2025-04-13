package com.xworkz.tshirtexample;

public class Runner {
    public static void main(String[] args) {

        Tshirt tshirt1 = new Tshirt();
        tshirt1.setBrand("RamRaj");
        tshirt1.setColor("White");
        tshirt1.setSize(23);

        Tshirt tshirt2 = new Tshirt();
        tshirt2.setBrand("RamRaj");
        tshirt2.setColor("White");
        tshirt2.setSize(23);

        System.out.println("Checking same location: " + (tshirt1 == tshirt2));
        boolean same = tshirt1.equals(tshirt2);
        System.out.println("tshirt1 is same as tshirt2: " + same);
    }
}
