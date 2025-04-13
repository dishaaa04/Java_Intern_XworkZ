package com.xworkz.stringrepresntation;

public class ToyRunner {
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.setName("Car");
        toy1.setType("Remote");
        toy1.setPrice(499.99);

        Toy toy2 = new Toy();
        toy2.setName("Car");
        toy2.setType("Remote");
        toy2.setPrice(499.99);

        System.out.println("Checking same location: " + (toy1 == toy2));
        boolean same = toy1.equals(toy2);
        System.out.println("toy1 is same as toy2: " + same);
    }
}
