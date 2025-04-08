package com.xworkz.casting;

public class BikeRunner {

    public static void main(String[] args) {

        Bike bike = new SportBike();
        bike.start();
        bike.stop();
        bike.type();
        bike.fuelType();

        System.out.println("----");

        SportBike sport = new SportBike();
        sport.start();
        sport.boostMode();
        sport.type();
        sport.stop();

        System.out.println("----");

        SmartSportBike smart = new SmartSportBike();
        smart.start();
        smart.boostMode();
        smart.type();

        System.out.println("----");

        smart.manageBike(new SportBike());
    }
}
