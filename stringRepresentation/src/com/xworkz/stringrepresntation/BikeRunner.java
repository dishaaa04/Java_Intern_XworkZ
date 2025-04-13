package com.xworkz.stringrepresntation;

public class BikeRunner {
    public static void main(String[] args) {

        Bike bike1 = new Bike();
        bike1.setModel("Royal Enfield");

        Bike bike2 = new Bike();
        bike2.setModel("Royal Enfield");

        System.out.println("Checking same location: " + (bike1 == bike2));
        System.out.println("bike1 is same as bike2: " + bike1.equals(bike2));
    }
}
