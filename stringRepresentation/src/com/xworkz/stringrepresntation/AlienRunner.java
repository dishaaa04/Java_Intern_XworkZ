package com.xworkz.stringrepresntation;

public class AlienRunner {
    public static void main(String[] args) {

        Alien alien1 = new Alien();
        alien1.setPlanet("Mars");

        Alien alien2 = new Alien();
        alien2.setPlanet("Mars");

        System.out.println("Checking same location: " + (alien1 == alien2));
        boolean same = alien1.equals(alien2);
        System.out.println("alien1 is same as alien2: " + same);
    }
}
