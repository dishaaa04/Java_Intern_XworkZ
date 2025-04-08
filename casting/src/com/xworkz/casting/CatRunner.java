package com.xworkz.casting;

public class CatRunner {

    public static void main(String[] args) {

        Cat cat = new PersianCat();
        cat.makeSound();
        cat.sleep();
        cat.type();
        cat.age();

        System.out.println("----");

        PersianCat persian = new PersianCat();
        persian.makeSound();
        persian.groomFur();
        persian.type();
        persian.sleep();

        System.out.println("----");

        SmartPersianCat smart = new SmartPersianCat();
        smart.makeSound();
        smart.groomFur();
        smart.type();

        System.out.println("----");

        smart.manageCat(new PersianCat());
    }
}
