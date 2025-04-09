package com.xworkz.stringrepresntation;

public class WallClock {

    private String shape;
    private String brand;
    private boolean hasAlarm;

    public WallClock(String shape, String brand, boolean hasAlarm) {
        this.shape = shape;
        this.brand = brand;
        this.hasAlarm = hasAlarm;
    }

    @Override
    public String toString() {
        return "[shape=" + shape + ", brand=" + brand + ", hasAlarm=" + hasAlarm + "]";
    }
}
