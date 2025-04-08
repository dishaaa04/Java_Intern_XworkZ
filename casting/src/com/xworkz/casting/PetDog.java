package com.xworkz.casting;

public class PetDog extends Dog {

    @Override
    public void eat() {
        System.out.println("Pet dog eats homemade food.");
    }

    public void manageAnimal(Animal animal) {
        System.out.println("Managing the animal...");

        animal.eat();
        animal.habitat();

        if (animal instanceof Dog) {
            System.out.println("It's a dog.");
            Dog dog = (Dog) animal;
            dog.bark();
            dog.type();
        }
    }
}
