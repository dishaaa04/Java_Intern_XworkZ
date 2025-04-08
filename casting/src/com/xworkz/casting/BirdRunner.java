package com.xworkz.casting;

public class BirdRunner {

    public static void main(String[] args) {

        Bird bird = new Parrot();
        bird.fly();
        bird.eat();
        bird.type();
        bird.habitat();

        System.out.println("----");

        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.talk();
        parrot.type();
        parrot.eat();

        System.out.println("----");

        SmartParrot smart = new SmartParrot();
        smart.fly();
        smart.talk();
        smart.type();

        System.out.println("----");

        smart.manageBird(new Parrot());
    }
}
