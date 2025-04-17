package com.xworkz.interfaceexample;

public class VoltageSensorImpl implements VoltageSensor {

    double voltage;

    @Override
    public void detectVoltage() {
        voltage = 220.0;  // Simulating detected voltage
        System.out.println("Voltage detected.");
    }

    @Override
    public void displayVoltage() {
        System.out.println("Detected Voltage: " + voltage + "V");
    }

    @Override
    public void resetSensor() {
        voltage = 0.0;
        System.out.println("Sensor reset.");
    }
}
