package com.xworkz.casting;

public class SmartCake extends Cake {

    @Override
    public void name() {
        System.out.println("Dessert name: Smart Chocolate Cake (Sugar-Free)");
    }

    public void manageDessert(Dessert dessert) {
        System.out.println("Managing dessert...");

        dessert.name();
        dessert.serve();

        if (dessert instanceof Cake) {
            System.out.println("It's a Cake!");
            Cake cake = (Cake) dessert;
            cake.layers();
            cake.flavor();
        }
    }
}
