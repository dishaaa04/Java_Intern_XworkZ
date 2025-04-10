package com.xworkz.stringrepresntation;

public class AlienRunner {
    public static void main(String[] args) {
        Alien alien = new Alien("Mars", 3, 120);
        String alienString = alien.toString();
        System.out.println("alien = " + alienString);

        int code = alien.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        String value = "spaceship";
        System.out.println("spaceship = " + value.hashCode());

        String value2 = "galaxy";
        System.out.println("galaxy = " + value2.hashCode());

        String value3 = "ufo";
        System.out.println("ufo = " + value3.hashCode());
    }
}

