package com.xworkz.casting;

public class FunctionGeneratorRunner {

    public static void main(String[] args) {

        FunctionGenerator generator = new SignalGenerator();
        generator.type();
        generator.frequencyRange();
        generator.waveform();
        generator.usage();

        System.out.println("----");

        SignalGenerator signal = new SignalGenerator();
        signal.type();
        signal.modulationTypes();
        signal.frequencyRange();
        signal.usage();

        System.out.println("----");

        SmartFunctionGenerator smart = new SmartFunctionGenerator();
        smart.type();
        smart.modulationTypes();
        smart.usage();

        System.out.println("----");

        smart.manageGenerator(new SignalGenerator());
    }
}
