package com.xworkz.stringrepresntation;

public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal = new Animal("Elephant", 4, false);
        String animalString = animal.toString();
        System.out.println("animal = " + animalString);

        int code = animal.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        String value = "jungle";
        System.out.println("jungle = " + value.hashCode());

        String value2 = "zebra";
        System.out.println("zebra = " + value2.hashCode());

        String value3 = "safari";
        System.out.println("safari = " + value3.hashCode());
    }
}
