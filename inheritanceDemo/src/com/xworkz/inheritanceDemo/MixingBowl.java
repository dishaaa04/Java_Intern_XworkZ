package com.xworkz.inheritanceDemo;

public class MixingBowl extends MeasuringCup {

    @Override
    public void measureFlour() {
        System.out.println("Mixing bowl is not used for exact measurements");
    }

    @Override
    public void measureLiquid() {
        System.out.println("Mixing bowl holds liquid but isn't for measuring");
    }

    @Override
    public void readScale() {
        System.out.println("Mixing bowl usually has no measurement scale");
    }

    @Override
    public void pourIngredient() {
        System.out.println("Mixing bowl can be used to pour mixed ingredients");
    }

    @Override
    public void cleanCup() {
        System.out.println("Mixing bowl is cleaned thoroughly after mixing");
    }

    public void mixIngredients() {
        System.out.println("Mixing bowl is used to combine ingredients");
    }

    public void kneadDough() {
        System.out.println("Mixing bowl is used for kneading dough");
    }

    public void holdBatter() {
        System.out.println("Mixing bowl holds cake or pancake batter");
    }

    public void useWhisk() {
        System.out.println("Mixing bowl is used with a whisk for beating");
    }
}
