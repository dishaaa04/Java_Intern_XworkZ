package com.xworkz.interfaceexample;

public class VoltageRegulatorImpl implements VoltageRegulator {

    double regulatedVoltage;

    @Override
    public void regulateVoltage(double voltage) {
        if (voltage > 230) {
            regulatedVoltage = 230;
        } else {
            regulatedVoltage = voltage;
        }
        System.out.println("Voltage regulated.");
    }

    @Override
    public void displayRegulatedVoltage() {
        System.out.println("Regulated Voltage: " + regulatedVoltage + "V");
    }

    @Override
    public void resetRegulator() {
        regulatedVoltage = 0.0;
        System.out.println("Voltage regulator reset.");
    }
}
