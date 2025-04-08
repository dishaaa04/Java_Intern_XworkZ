package com.xworkz.casting;

public class DessertRunner {

    public static void main(String[] args) {

        Dessert dessert = new Cake();
        dessert.name();
        dessert.flavor();
        dessert.calories();
        dessert.serve();

        System.out.println("----");

        Cake cake = new Cake();
        cake.name();
        cake.layers();
        cake.serve();
        cake.flavor();

        System.out.println("----");

        SmartCake smart = new SmartCake();
        smart.name();
        smart.layers();
        smart.serve();

        System.out.println("----");

        smart.manageDessert(new Cake());
    }
}
