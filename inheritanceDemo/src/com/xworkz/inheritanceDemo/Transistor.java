package com.xworkz.inheritanceDemo;

public class Transistor extends Diode {

    public Transistor() {
        super();
        System.out.println("Transistor is initialized");
    }

    @Override
    public void allowCurrentOneWay() {
        System.out.println("Transistor controls current flow");
    }

    @Override
    public void blockReverseCurrent() {
        System.out.println("Transistor blocks unwanted currents during switching");
    }

    @Override
    public void conduct() {
        System.out.println("Transistor conducts depending on base current");
    }

    @Override
    public void protectCircuit() {
        System.out.println("Transistor regulates circuit operation");
    }

    @Override
    public void rectification() {
        System.out.println("Transistor amplifies and switches, not rectifies");
    }

    public void amplifySignal() {
        System.out.println("Transistor amplifies signals");
    }

    public void switchCircuit() {
        System.out.println("Transistor switches the circuit");
    }

    public void baseControl() {
        System.out.println("Transistor is controlled by base current");
    }

    public void currentGain() {
        System.out.println("Transistor provides current gain");
    }

    public void operateInModes() {
        System.out.println("Transistor operates in cutoff, active, and saturation modes");
    }
}
