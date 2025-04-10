package com.xworkz.stringrepresntation;

public class Fan {
    private String brand;
    private int speedLevels;
    private boolean isCeilingFan;

    public Fan(String brand, int speedLevels, boolean isCeilingFan) {
        this.brand = brand;
        this.speedLevels = speedLevels;
        this.isCeilingFan = isCeilingFan;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", speedLevels=" + speedLevels + ", isCeilingFan=" + isCeilingFan + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 1700;
    }
}
