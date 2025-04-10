package com.xworkz.stringrepresntation;

public class Speaker {
    private String brand;
    private int watts;
    private boolean isBluetooth;

    public Speaker(String brand, int watts, boolean isBluetooth) {
        this.brand = brand;
        this.watts = watts;
        this.isBluetooth = isBluetooth;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", watts=" + watts + ", isBluetooth=" + isBluetooth + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 5700;
    }
}
