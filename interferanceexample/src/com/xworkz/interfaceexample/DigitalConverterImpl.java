package com.xworkz.interfaceexample;

public class DigitalConverterImpl implements DigitalConverter {

    String digitalData;

    @Override
    public void convertToDigital(String analogData) {
        digitalData = "Digital version of: " + analogData;
        System.out.println("Data converted to digital.");
    }

    @Override
    public void displayDigitalData() {
        if (digitalData != null) {
            System.out.println("Digital Data: " + digitalData);
        } else {
            System.out.println("No data available.");
        }
    }

    @Override
    public void clearData() {
        digitalData = null;
        System.out.println("Data cleared.");
    }
}
