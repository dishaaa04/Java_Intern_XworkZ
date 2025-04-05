package com.xworkz.inheritanceDemo;

public class FryingPan extends PressureCooker {

    @Override
    public void addIngredients() {
        System.out.println("Ingredients are added directly into the frying pan");
    }

    @Override
    public void closeLid() {
        System.out.println("Frying pan may use a loose lid or none at all");
    }

    @Override
    public void buildPressure() {
        System.out.println("Frying pan does not build pressure; it heats openly");
    }

    @Override
    public void cookFood() {
        System.out.println("Frying pan cooks food by direct contact with heat");
    }

    @Override
    public void releasePressure() {
        System.out.println("Frying pan does not need to release pressure");
    }

    public void fry() {
        System.out.println("Frying pan is used to fry vegetables or meat");
    }

    public void flipFood() {
        System.out.println("Frying pan allows flipping food while cooking");
    }

    public void sauté() {
        System.out.println("Frying pan is used to sauté ingredients");
    }

    public void cleanPan() {
        System.out.println("Frying pan is cleaned after use");
    }
}
