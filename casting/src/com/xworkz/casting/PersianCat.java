package com.xworkz.casting;

public class PersianCat extends Cat {

    @Override
    public void makeSound() {
        System.out.println("Persian cat purrs softly.");
    }

    @Override
    public void sleep() {
        System.out.println("Persian cat is sleeping on a cushion.");
    }

    public void groomFur() {
        System.out.println("Persian cat is grooming its long fur.");
    }

    @Override
    public void type() {
        System.out.println("Type: Persian Cat.");
    }
}
