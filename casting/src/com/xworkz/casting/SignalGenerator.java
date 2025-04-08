package com.xworkz.casting;

public class SignalGenerator extends FunctionGenerator {

    @Override
    public void type() {
        System.out.println("Type: Signal Generator (Analog + Digital)");
    }

    @Override
    public void frequencyRange() {
        System.out.println("Frequency Range: 10Hz to 100MHz");
    }

    public void modulationTypes() {
        System.out.println("Supports AM, FM, and PM modulation");
    }

    @Override
    public void usage() {
        System.out.println("Usage: Communication and radar system testing");
    }
}
