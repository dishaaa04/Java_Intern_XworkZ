package com.xworkz.inheritanceDemo;

public class Wardrobe extends Sofa {

    @Override
    public void provideSeating() {
        System.out.println("Wardrobe is used for storage, not for seating");
    }

    @Override
    public void addCushions() {
        System.out.println("Wardrobe doesn't have cushions");
    }

    @Override
    public void recline() {
        System.out.println("Wardrobe does not recline");
    }

    @Override
    public void foldOutBed() {
        System.out.println("Wardrobe is not convertible into a bed");
    }

    @Override
    public void cleanFabric() {
        System.out.println("Wardrobe surface is wiped clean instead of fabric cleaning");
    }

    public void storeClothes() {
        System.out.println("Storing clothes neatly inside the wardrobe");
    }

    public void organizeShelves() {
        System.out.println("Organizing shelves and drawers");
    }

    public void lockWardrobe() {
        System.out.println("Locking the wardrobe for safety");
    }

    public void openDoors() {
        System.out.println("Opening the wardrobe doors to access contents");
    }
}
