package com.xworkz.inheritanceDemo;

public class Vehicles {
    // Constructor
    public Vehicles() {
        System.out.println("Vehicle class initialized");
    }

    // 5 instance methods in parent class
    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    public void accelerate() {
        System.out.println("Vehicle is accelerating");
    }

    public void brake() {
        System.out.println("Vehicle is braking");
    }

    public void displayInfo() {
        System.out.println("This is a vehicle");
    }
}