package com.xworkz.stringrepresntation;

public class Speaker {

    private String brand;
    private int wattage;
    private boolean isBluetooth;

    public Speaker(String brand, int wattage, boolean isBluetooth) {
        this.brand = brand;
        this.wattage = wattage;
        this.isBluetooth = isBluetooth;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", wattage=" + wattage + "W, isBluetooth=" + isBluetooth + "]";
    }
}
