package com.xworkz.casting;

public class SmartPersianCat extends PersianCat {

    @Override
    public void makeSound() {
        System.out.println("Smart Persian cat meows with expression.");
    }

    public void manageCat(Cat cat) {
        System.out.println("Managing cat...");

        cat.makeSound();
        cat.age();

        if (cat instanceof PersianCat) {
            System.out.println("It's a Persian Cat.");
            PersianCat persian = (PersianCat) cat;
            persian.groomFur();
            persian.type();
        }
    }
}
