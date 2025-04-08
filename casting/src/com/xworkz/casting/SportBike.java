package com.xworkz.casting;

public class SportBike extends Bike {

    @Override
    public void start() {
        System.out.println("Sport bike roars to life.");
    }

    @Override
    public void stop() {
        System.out.println("Sport bike is braking quickly.");
    }

    public void boostMode() {
        System.out.println("Boost mode activated!");
    }

    @Override
    public void type() {
        System.out.println("Type: Sport bike.");
    }
}
