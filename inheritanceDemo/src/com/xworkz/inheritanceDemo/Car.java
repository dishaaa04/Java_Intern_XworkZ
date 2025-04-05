package com.xworkz.inheritanceDemo;

public class Car extends Vehicle {

    public Car() {
        super();
        System.out.println("Car is created");
    }

    @Override
    public void start() {
        System.out.println("Car is starting with ignition");
    }

    @Override
    public void stop() {
        System.out.println("Car is applying brakes to stop");
    }

    @Override
    public void fuel() {
        System.out.println("Car runs on petrol or diesel");
    }

    @Override
    public void moves() {
        System.out.println("Car moves smoothly on the road");
    }

    @Override
    public void carry() {
        System.out.println("Car carries up to 5 people");
    }

    public void accelerate() {
        System.out.println("Car is accelerating");
    }

    public void brake() {
        System.out.println("Car is braking");
    }

    public void airConditioning() {
        System.out.println("Car has air conditioning system");
    }

    public void musicSystem() {
        System.out.println("Car is playing music");
    }

    public void sunroof() {
        System.out.println("Car has a sunroof");
    }
}
