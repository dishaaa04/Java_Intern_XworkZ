package com.xworkz.casting;

public class CarRunner {

    public static void main(String[] args) {

        Car car = new SportsCar();
        car.start();
        car.stop();
        car.fuelType();
        car.maxSpeed();

        System.out.println("----");

        SportsCar sports = new SportsCar();
        sports.start();
        sports.turboBoost();
        sports.fuelType();
        sports.stop();

        System.out.println("----");

        SmartSportsCar smart = new SmartSportsCar();
        smart.start();
        smart.turboBoost();
        smart.fuelType();

        System.out.println("----");

        smart.manageCar(new SportsCar());
    }
}
