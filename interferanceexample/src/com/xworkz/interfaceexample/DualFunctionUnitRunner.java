package com.xworkz.interfaceexample;

public class DualFunctionUnitRunner {
    public static void main(String[] args) {
        ActuatorUnit actuator = new DualFunctionUnit();
        actuator.activate();
        actuator.deactivate();
        actuator.calibrate();

        System.out.println("------------------------");

        SensorUnit sensor = new DualFunctionUnit();
        sensor.sense();
        sensor.resetSensor();
        sensor.configureSensor();
    }
}

