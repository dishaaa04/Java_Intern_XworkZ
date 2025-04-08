package com.xworkz.casting;

public class SmartSportBike extends SportBike {

    @Override
    public void start() {
        System.out.println("Smart sport bike starts with fingerprint sensor.");
    }

    public void manageBike(Bike bike) {
        System.out.println("Managing bike...");

        bike.start();
        bike.fuelType();

        if (bike instanceof SportBike) {
            System.out.println("It is a sport bike.");
            SportBike sport = (SportBike) bike;
            sport.boostMode();
            sport.type();
        }
    }
}
