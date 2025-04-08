package com.xworkz.casting;

public class SmartParrot extends Parrot {

    @Override
    public void fly() {
        System.out.println("Smart Parrot Flies!!!!.");
    }

    public void manageBird(Bird bird) {
        System.out.println("Managing bird...");

        bird.fly();
        bird.habitat();

        if (bird instanceof Parrot) {
            System.out.println("It's a parrot.");
            Parrot parrot = (Parrot) bird;
            parrot.talk();
            parrot.type();
        }
    }
}
