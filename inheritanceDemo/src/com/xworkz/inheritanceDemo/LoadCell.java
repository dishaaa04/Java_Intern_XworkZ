package com.xworkz.inheritanceDemo;

public class LoadCell extends StrainGauge {

    @Override
    public void measureStrain() {
        System.out.println("LoadCell measures strain with high precision for weight detection");
    }

    @Override
    public void calibrateGauge() {
        System.out.println("LoadCell calibrates for weight and strain accuracy");
    }

    @Override
    public void displayStrain() {
        System.out.println("LoadCell displays strain values with weight measurement");
    }

    public void measureLoad() {
        System.out.println("LoadCell measures applied load (weight)");
    }

    public void calibrateLoadCell() {
        System.out.println("LoadCell calibrates for accurate load measurement");
    }

    public void displayLoad() {
        System.out.println("LoadCell displays current load measurement");
    }
}
