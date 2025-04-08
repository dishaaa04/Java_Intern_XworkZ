package com.xworkz.casting;

public class SportsCar extends Car {

    @Override
    public void start() {
        System.out.println("Sports car roars to life!");
    }

    @Override
    public void stop() {
        System.out.println("Sports car stops with ABS braking.");
    }

    public void turboBoost() {
        System.out.println("Turbo boost activated!");
    }

    @Override
    public void fuelType() {
        System.out.println("Fuel type: High-octane petrol.");
    }
}
