package com.xworkz.casting;

public class Cake extends Dessert {

    @Override
    public void name() {
        System.out.println("Dessert name: Chocolate Cake");
    }

    @Override
    public void flavor() {
        System.out.println("Flavor: Chocolate");
    }

    public void layers() {
        System.out.println("Cake has 3 layers.");
    }

    @Override
    public void serve() {
        System.out.println("Served chilled with frosting.");
    }
}
