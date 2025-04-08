package com.xworkz.casting;

public class Parrot extends Bird {

    @Override
    public void fly() {
        System.out.println("Parrot flies gracefully.");
    }

    @Override
    public void eat() {
        System.out.println("Parrot eats fruits and seeds.");
    }

    public void talk() {
        System.out.println("Parrot is mimicking words.");
    }

    @Override
    public void type() {
        System.out.println("Tropical bird - Parrot.");
    }
}
