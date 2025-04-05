package com.xworkz.inheritanceDemo;

public class PressureSensor extends TemperatureSensor {

    @Override
    public void measureTemperature() {
        System.out.println("PressureSensor measures pressure-related temperature");
    }

    @Override
    public void calibrateSensor() {
        System.out.println("PressureSensor calibrates for pressure and temperature accuracy");
    }

    @Override
    public void displayTemperature() {
        System.out.println("PressureSensor displays pressure-temperature reading");
    }

    public void measurePressure() {
        System.out.println("PressureSensor measures pressure");
    }

    public void calibratePressure() {
        System.out.println("PressureSensor calibrates for accurate pressure readings");
    }

    public void displayPressure() {
        System.out.println("PressureSensor displays current pressure");
    }
}
