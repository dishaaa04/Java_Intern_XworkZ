package com.xworkz.interfaceexample;

public class ActuatorUnitImpl implements ActuatorUnit {
    public void activate() {
        System.out.println("Actuator activated");
    }

    public void deactivate() {
        System.out.println("Actuator deactivated");
    }

    public void calibrate() {
        System.out.println("Actuator calibrated");
    }
}
