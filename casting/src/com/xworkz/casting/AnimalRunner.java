package com.xworkz.casting;

public class AnimalRunner {

    public static void main(String[] args) {

        Animal animal = new Dog();
        animal.eat();
        animal.sleep();
        animal.type();
        animal.habitat();

        System.out.println("----");

        Dog dog = new Dog();
        dog.eat();
        dog.bark();
        dog.type();
        dog.sleep();

        System.out.println("----");

        PetDog petDog = new PetDog();
        petDog.eat();
        petDog.bark();
        petDog.type();

        System.out.println("----");

        petDog.manageAnimal(new Dog());
    }
}
