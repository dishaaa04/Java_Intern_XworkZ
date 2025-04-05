package com.xworkz.inheritanceDemo;

public class WashingMachine extends Appliance {

    WashingMachine() {
        super();
        System.out.println("Washing Machine class");
    }

    @Override
    public void turnOn() {
        System.out.println("Washing machine is powered on");
    }

    @Override
    public void turnOff() {
        System.out.println("Washing machine is shutting down");
    }

    @Override
    public void consumePower() {
        System.out.println("Washing machine consumes 500W per cycle");
    }

    @Override
    public void warranty() {
        System.out.println("Washing machine has a 2-year warranty");
    }

    @Override
    public void maintenance() {
        System.out.println("Washing machine requires monthly maintenance");
    }

    public void washClothes() {
        System.out.println("Washing machine washes clothes");
    }

    public void rinse() {
        System.out.println("Washing machine rinses clothes");
    }

    public void spinDry() {
        System.out.println("Washing machine dries clothes");
    }

    public void detergentUsage() {
        System.out.println("Washing machine uses detergent");
    }

    public void setTimer() {
        System.out.println("Washing machine has a timer setting");
    }
}
