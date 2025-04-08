package com.xworkz.casting;

public class WashingMachine extends Appliance {

    @Override
    public void turnOn() {
        System.out.println("Washing machine is now running.");
    }

    @Override
    public void turnOff() {
        System.out.println("Washing machine is turned off.");
    }

    public void washClothes() {
        System.out.println("Washing clothes...");
    }

    @Override
    public void type() {
        System.out.println("Home appliance - Washing Machine.");
    }
}
