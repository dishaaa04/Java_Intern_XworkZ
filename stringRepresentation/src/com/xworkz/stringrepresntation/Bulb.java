package com.xworkz.stringrepresntation;

public class Bulb {
    private int wattage;
    private String type;
    private boolean isLED;

    public Bulb(int wattage, String type, boolean isLED) {
        this.wattage = wattage;
        this.type = type;
        this.isLED = isLED;
    }

    @Override
    public String toString() {
        return "[wattage=" + wattage + ", type=" + type + ", isLED=" + isLED + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 211;
    }
}
