package com.xworkz.stringrepresntation;

public class AnimalRunner {
    public static void main(String[] args) {

        Animal animal1 = new Animal();
        animal1.setSpecies("Elephant");

        Animal animal2 = new Animal();
        animal2.setSpecies("Elephant");

        System.out.println("Checking same location: " + (animal1 == animal2));
        boolean same = animal1.equals(animal2);
        System.out.println("animal1 is same as animal2: " + same);
    }
}
