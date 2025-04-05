package com.xworkz.inheritanceDemo;

public class Bird extends Animal {

    Bird() {
        super();
        System.out.println("Bird class");
    }

    @Override
    public void eat() {
        System.out.println("Bird pecks at seeds and fruits");
    }

    @Override
    public void sleep() {
        System.out.println("Bird sleeps on a perch");
    }

    @Override
    public void move() {
        System.out.println("Bird hops or flies to move");
    }

    public void fly() {
        System.out.println("Bird can fly");
    }

    public void sing() {
        System.out.println("Bird can sing");
    }

    public void layEggs() {
        System.out.println("Bird lays eggs");
    }

    public void buildNest() {
        System.out.println("Bird builds a nest");
    }

    public void migrate() {
        System.out.println("Birds migrate in winter");
    }
}
