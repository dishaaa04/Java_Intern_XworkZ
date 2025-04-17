package com.xworkz.interfaceexample;

public class VoltageRegulatorRunner {
    public static void main(String[] args) {
        VoltageRegulator regulator = new VoltageRegulatorImpl();
        regulator.displayRegulatedVoltage();
        regulator.regulateVoltage(250);
        regulator.displayRegulatedVoltage();
        regulator.regulateVoltage(200);
        regulator.displayRegulatedVoltage();
        regulator.resetRegulator();
        regulator.displayRegulatedVoltage();
    }
}
