package com.xworkz.inheritanceDemo;

public class Appliance {

    Appliance() {
        System.out.println("Appliance class");
    }

    public void turnOn() {
        System.out.println("Appliance is turned on");
    }

    public void turnOff() {
        System.out.println("Appliance is turned off");
    }

    public void consumePower() {
        System.out.println("Appliance consumes power");
    }

    public void warranty() {
        System.out.println("Appliance has a warranty");
    }

    public void maintenance() {
        System.out.println("Appliance requires maintenance");
    }
}
