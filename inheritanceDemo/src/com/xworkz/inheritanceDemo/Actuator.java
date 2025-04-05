package com.xworkz.inheritanceDemo;

public class Actuator extends Multimeter {

    @Override
    public void measureVoltage() {
        System.out.println("Actuator measures voltage with enhanced accuracy");
    }

    @Override
    public void measureCurrent() {
        System.out.println("Actuator measures current with enhanced precision");
    }

    @Override
    public void measureResistance() {
        System.out.println("Actuator measures resistance with advanced algorithms");
    }

    @Override
    public void checkContinuity() {
        System.out.println("Actuator checks continuity with improved diagnostics");
    }

    @Override
    public void displayReading() {
        System.out.println("Actuator displays enhanced reading with precise metrics");
    }

    public void convertSignal() {
        System.out.println("Actuator converts signal into motion");
    }

    public void push() {
        System.out.println("Actuator pushes the mechanism");
    }

    public void pull() {
        System.out.println("Actuator pulls the mechanism");
    }

    public void controlMovement() {
        System.out.println("Actuator controls precise movement");
    }

    public void applyForce() {
        System.out.println("Actuator applies mechanical force");
    }
}
