package com.xworkz.casting;

public class SmartSportsCar extends SportsCar {

    @Override
    public void start() {
        System.out.println("Smart sports car starts with fingerprint sensor.");
    }

    public void manageCar(Car car) {
        System.out.println("Managing car...");

        car.start();
        car.maxSpeed();

        if (car instanceof SportsCar) {
            System.out.println("It's a Sports Car.");
            SportsCar sport = (SportsCar) car;
            sport.turboBoost();
            sport.fuelType();
        }
    }
}
