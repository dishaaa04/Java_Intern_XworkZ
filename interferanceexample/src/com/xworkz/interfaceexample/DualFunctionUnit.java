package com.xworkz.interfaceexample;

public class DualFunctionUnit implements ActuatorUnit, SensorUnit {
    public void activate() {
        System.out.println("Activated");
    }

    public void deactivate() {
        System.out.println("Deactivated");
    }

    public void calibrate() {
        System.out.println("Calibrated");
    }

    public void sense() {
        System.out.println("Sensing");
    }

    public void resetSensor() {
        System.out.println("Sensor Reset");
    }

    public void configureSensor() {
        System.out.println("Sensor Configured");
    }
}
