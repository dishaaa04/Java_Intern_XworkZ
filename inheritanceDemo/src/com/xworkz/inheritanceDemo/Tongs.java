package com.xworkz.inheritanceDemo;

public class Tongs extends RollingPin {

    @Override
    public void prepareDough() {
        System.out.println("Tongs are not used to prepare dough");
    }

    @Override
    public void applyPressure() {
        System.out.println("Tongs do not apply pressure like a rolling pin");
    }

    @Override
    public void rotateDough() {
        System.out.println("Tongs are not used to rotate dough");
    }

    @Override
    public void cleanPin() {
        System.out.println("Tongs are cleaned after handling food");
    }

    @Override
    public void storePin() {
        System.out.println("Tongs are stored in utensil rack");
    }

    public void gripFood() {
        System.out.println("Tongs grip hot food items safely");
    }

    public void turnItems() {
        System.out.println("Tongs are used to turn items while cooking");
    }

    public void serveFood() {
        System.out.println("Tongs are used to serve food hygienically");
    }

    public void handleHotPans() {
        System.out.println("Tongs can help handle small hot containers");
    }
}
