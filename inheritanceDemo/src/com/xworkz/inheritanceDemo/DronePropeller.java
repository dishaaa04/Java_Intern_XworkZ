package com.xworkz.inheritanceDemo;

public class DronePropeller extends Turbine {

    public void liftDrone() {
        System.out.println("DronePropeller lifts the drone off the ground");
    }

    public void controlDirection() {
        System.out.println("DronePropeller controls the flight direction");
    }

    public void hover() {
        System.out.println("DronePropeller helps the drone hover in place");
    }

    public void adjustSpeed() {
        System.out.println("DronePropeller adjusts speed for movement");
    }

    public void stabilizeFlight() {
        System.out.println("DronePropeller stabilizes the drone during flight");
    }
}
