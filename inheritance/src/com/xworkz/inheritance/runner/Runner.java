package com.xworkz.inheritance.runner;

import com.xworkz.inheritance.internal.Car;
import com.xworkz.inheritance.internal.Vehicle;

public class Runner {
    public static void main(String[] args) {
        System.out.println("=== CREATING PARENT (VEHICLE) ===");
        // Create a copy of Parent
        Vehicle vehicle = new Vehicle("Toyota", "Generic", 2023, 15000.5, "Silver");

        // Invoke five methods on Parent
        System.out.println("\nInvoking methods on Parent (Vehicle):");
        vehicle.startEngine();
        vehicle.displayInfo();
        vehicle.honkHorn();
        vehicle.accelerate(20);
        System.out.println("Fuel Efficiency: " + vehicle.calculateFuelEfficiency() + " mpg");
        vehicle.stopEngine();

        System.out.println("\n=== CREATING SUBCLASS (CAR) WITH PARENT REFERENCE ===");
        // Create a copy of Sub-class using parent as reference type
        Vehicle carAsVehicle = new Car("Honda", "Civic", 2024, 5000.0, "Blue",
                4, false, "Automatic", 1.8);

        // Invoke five methods on Sub-class using parent reference
        System.out.println("\nInvoking methods on Sub-class (Car) using parent reference:");
        carAsVehicle.startEngine(); // Polymorphic call, Car's version will execute
        carAsVehicle.displayInfo();
        carAsVehicle.honkHorn(); // Polymorphic call, Car's version will execute
        carAsVehicle.accelerate(30);
        System.out.println("Fuel Efficiency: " + carAsVehicle.calculateFuelEfficiency() + " mpg"); // Polymorphic call

        System.out.println("\n=== CREATING SUBCLASS (CAR) WITH SAME CLASS REFERENCE ===");
        // Create a copy of Sub-class using same class as reference type
        Car car = new Car("Tesla", "Model 3", 2025, 1000.0, "Red",
                4, true, "Automatic", 0.0);

        // Invoke five methods on Sub-class using same class reference
        System.out.println("\nInvoking methods on Sub-class (Car) using same class reference:");
        car.displayCarInfo(); // Car-specific method
        car.openSunroof(); // Car-specific method
        car.engageCruiseControl(); // Car-specific method
        car.parkingAssist(); // Car-specific method
        car.toggleHeadlights(); // Car-specific method

        System.out.println("\n=== DEMONSTRATING INHERITANCE RELATIONSHIP ===");
        // Show that car is a Vehicle
        System.out.println("Is car instance of Vehicle? " + (car instanceof Vehicle));
        System.out.println("Is car instance of Car? " + (car instanceof Car));
        System.out.println("Is carAsVehicle instance of Car? " + (carAsVehicle instanceof Car));
    }
}
