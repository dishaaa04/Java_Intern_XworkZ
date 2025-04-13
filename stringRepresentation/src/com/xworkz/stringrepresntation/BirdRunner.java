package com.xworkz.stringrepresntation;

public class BirdRunner {
    public static void main(String[] args) {

        Bird bird1 = new Bird();
        bird1.setName("Peacock");

        Bird bird2 = new Bird();
        bird2.setName("Peacock");

        System.out.println("Checking same location: " + (bird1 == bird2));
        System.out.println("bird1 is same as bird2: " + bird1.equals(bird2));
    }
}
