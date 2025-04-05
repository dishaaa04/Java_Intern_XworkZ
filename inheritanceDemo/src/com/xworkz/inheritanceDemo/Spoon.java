package com.xworkz.inheritanceDemo;

public class Spoon extends Plate {

    public Spoon() {
        System.out.println("Spoon is created");
    }

    @Override
    public void shape() {
        System.out.println("Spoon has a curved shape");
    }

    @Override
    public void clean() {
        System.out.println("Spoon is being cleaned carefully");
    }

    @Override
    public void hold() {
        System.out.println("Spoon holds smaller amounts of food");
    }

    @Override
    public void size() {
        System.out.println("Spoons come in small sizes");
    }

    @Override
    public void material() {
        System.out.println("Spoons can be made of stainless steel or plastic");
    }

    public void eat() {
        System.out.println("Spoon is used to eat food");
    }

    public void design() {
        System.out.println("Spoons have different designs");
    }

    public void measure() {
        System.out.println("Spoons can be used to measure ingredients");
    }

    public void stir() {
        System.out.println("Spoon is used to stir liquids");
    }

    public void scoop() {
        System.out.println("Spoon scoops soft food items");
    }
}
