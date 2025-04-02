package com.xworkz.inheritance.internal;

public class Car extends Vehicle {
    private int numDoors;
    private boolean isElectric;
    private String transmissionType;
    private double engineSize;

    // Constructor
    public Car(String make, String model, int year, double mileage, String color,
               int numDoors, boolean isElectric, String transmissionType, double engineSize) {
        super(make, model, year, mileage, color); // Call parent constructor
        this.numDoors = numDoors;
        this.isElectric = isElectric;
        this.transmissionType = transmissionType;
        this.engineSize = engineSize;
    }

    // Override parent methods
    @Override
    public void startEngine() {
        if (isElectric) {
            System.out.println("Car powered on silently");
        } else {
            System.out.println("Car engine roars to life");
        }
    }

    @Override
    public double calculateFuelEfficiency() {
        if (isElectric) {
            return 120.0; // Electric cars have higher MPGe
        } else {
            return 30.0; // Regular car fuel efficiency
        }
    }

    @Override
    public void honkHorn() {
        System.out.println("Car honks: Honk Honk!");
    }

    // Additional methods specific to Car
    public void openSunroof() {
        System.out.println("Car sunroof opened");
    }

    public void engageCruiseControl() {
        System.out.println("Car cruise control engaged");
    }

    public void displayCarInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Car Specific Information:");
        System.out.println("Number of Doors: " + numDoors);
        System.out.println("Electric: " + (isElectric ? "Yes" : "No"));
        System.out.println("Transmission: " + transmissionType);
        System.out.println("Engine Size: " + engineSize + "L");
    }

    public void parkingAssist() {
        System.out.println("Car parking assist activated");
    }

    public void toggleHeadlights() {
        System.out.println("Car headlights toggled");
    }
}
