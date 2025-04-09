package com.xworkz.stringrepresntation;

public class AlienRunner {
    public static void main(String[] args) {
        Alien alien = new Alien("Mars", 230, true);
        System.out.println("alien" + alien.toString());
    }
}
