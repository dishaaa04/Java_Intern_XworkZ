package com.xworkz.interfaceexample;

public class VoltageSensorRunner {
    public static void main(String[] args) {
        VoltageSensor sensor = new VoltageSensorImpl();
        sensor.displayVoltage();
        sensor.detectVoltage();
        sensor.displayVoltage();
        sensor.resetSensor();
        sensor.displayVoltage();
    }
}
