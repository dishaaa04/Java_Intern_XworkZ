package com.xworkz.stringrepresntation;

public class Tubelight {
    private int wattage;
    private String brand;
    private boolean isLED;

    public Tubelight(int wattage, String brand, boolean isLED) {
        this.wattage = wattage;
        this.brand = brand;
        this.isLED = isLED;
    }

    @Override
    public String toString() {
        return "[wattage=" + wattage + ", brand=" + brand + ", isLED=" + isLED + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 6900;
    }
}
