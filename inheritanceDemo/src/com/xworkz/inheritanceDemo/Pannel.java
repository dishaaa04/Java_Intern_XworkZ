package com.xworkz.inheritanceDemo;

public class Pannel extends Projector {

    public Pannel() {
        System.out.println("Pannel initialized");
    }

    @Override
    public void changeBrightness() {
        System.out.println("Pannel adjusts screen brightness differently");
    }

    public void adjustVolume() {
        System.out.println("Adjusting volume from pannel");
    }

    public void changeSource() {
        System.out.println("Changing input source on pannel");
    }

    public void displayMenu() {
        System.out.println("Displaying menu on pannel");
    }

    public void enableSmartMode() {
        System.out.println("Enabling smart mode");
    }

    public void touchInput() {
        System.out.println("Touch input enabled on pannel");
    }
}
