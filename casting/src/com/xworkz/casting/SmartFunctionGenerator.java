package com.xworkz.casting;

public class SmartFunctionGenerator extends SignalGenerator {

    @Override
    public void type() {
        System.out.println("Type: Smart Function Generator with touchscreen UI");
    }

    public void manageGenerator(FunctionGenerator generator) {
        System.out.println("Managing function generator...");

        generator.type();
        generator.frequencyRange();

        if (generator instanceof SignalGenerator) {
            System.out.println("It's a SignalGenerator.");
            SignalGenerator signal = (SignalGenerator) generator;
            signal.modulationTypes();
            signal.usage();
        }
    }
}
