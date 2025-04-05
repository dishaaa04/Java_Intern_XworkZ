package com.xworkz.inheritanceDemo;

public class Diode {

    public Diode() {
        System.out.println("Diode is initialized");
    }

    public void allowCurrentOneWay() {
        System.out.println("Diode allows current in one direction");
    }

    public void blockReverseCurrent() {
        System.out.println("Diode blocks reverse current");
    }

    public void conduct() {
        System.out.println("Diode conducts under forward bias");
    }

    public void protectCircuit() {
        System.out.println("Diode protects circuits from surges");
    }

    public void rectification() {
        System.out.println("Diode is used for rectification");
    }
}
