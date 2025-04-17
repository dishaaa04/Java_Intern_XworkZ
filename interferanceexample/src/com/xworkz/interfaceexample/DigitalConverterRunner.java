package com.xworkz.interfaceexample;

public class DigitalConverterRunner {
    public static void main(String[] args) {
        DigitalConverter converter = new DigitalConverterImpl();
        converter.displayDigitalData();
        converter.convertToDigital("Analog Data: Audio");
        converter.displayDigitalData();
        converter.clearData();
        converter.displayDigitalData();
    }
}
