package com.xworkz.inheritanceDemo;

public class Blender extends Refrigerator {

    @Override
    public void powerOn() {
        System.out.println("Blender is powered on and ready to blend");
    }

    @Override
    public void coolItems() {
        System.out.println("Blender does not cool items, it blends them");
    }

    @Override
    public void defrost() {
        System.out.println("Blender does not defrost, it crushes ice instead");
    }

    @Override
    public void adjustTemperature() {
        System.out.println("Blender adjusts speed, not temperature");
    }

    @Override
    public void storeFood() {
        System.out.println("Blender does not store food; it processes it");
    }

    public void blendIngredients() {
        System.out.println("Blender blends fruits and vegetables into smoothies");
    }

    public void chop() {
        System.out.println("Blender chops ingredients with sharp blades");
    }

    public void grind() {
        System.out.println("Blender grinds spices and grains");
    }

    public void cleanAutomatically() {
        System.out.println("Blender cleans itself with auto-clean function");
    }
}
