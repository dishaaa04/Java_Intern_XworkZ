package com.xworkz.casting;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog is eating pedigree.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeps in its kennel.");
    }

    public void bark() {
        System.out.println("Dog is barking!");
    }

    @Override
    public void type() {
        System.out.println("Domestic Animal - Dog.");
    }
}
