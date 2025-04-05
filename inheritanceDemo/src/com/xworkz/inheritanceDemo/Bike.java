package com.xworkz.inheritanceDemo;

public class Bike extends TwoWheeler {

    public Bike() {
        super();
        System.out.println("Bike is ready");
    }

    @Override
    public void start() {
        System.out.println("Bike is starting with a button or kick");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping using brakes");
    }

    @Override
    public void fuel() {
        System.out.println("Bike uses petrol");
    }

    @Override
    public void horn() {
        System.out.println("Bike horn is loud");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike is gaining speed");
    }

    public void twoWheels() {
        System.out.println("Bike has two wheels");
    }

    public void handlebar() {
        System.out.println("Bike has a handlebar for steering");
    }

    public void kickStart() {
        System.out.println("Bike can be started by kick");
    }

    public void fuelEfficiency() {
        System.out.println("Bike has good fuel efficiency");
    }

    public void lightweight() {
        System.out.println("Bike is lightweight and easy to ride");
    }
}
