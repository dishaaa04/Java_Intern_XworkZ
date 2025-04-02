package com.xworkz.inheritance.internal;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double mileage;
    private String color;

    // Constructor
    public Vehicle(String make, String model, int year, double mileage, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.color = color;
    }

    // Instance Methods
    public void startEngine() {
        System.out.println("Vehicle engine started");
    }

    public void stopEngine() {
        System.out.println("Vehicle engine stopped");
    }

    public double calculateFuelEfficiency() {
        return 25.0; // Base fuel efficiency for general vehicle
    }

    public void honkHorn() {
        System.out.println("Beep Beep!");
    }

    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Mileage: " + mileage);
        System.out.println("Color: " + color);
    }

    public void accelerate(int speedIncrease) {
        System.out.println("Vehicle speed increased by " + speedIncrease + " mph");
    }
}


