package com.xworkz.interfaceexample;

public interface VoltageRegulator {
    void regulateVoltage(double voltage);
    void displayRegulatedVoltage();
    void resetRegulator();
}
