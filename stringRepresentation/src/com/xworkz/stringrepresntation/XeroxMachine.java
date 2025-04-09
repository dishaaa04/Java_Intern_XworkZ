package com.xworkz.stringrepresntation;

public class XeroxMachine {

    private String brand;
    private int speed;
    private boolean supportsColor;

    public XeroxMachine(String brand, int speed, boolean supportsColor) {
        this.brand = brand;
        this.speed = speed;
        this.supportsColor = supportsColor;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", speed=" + speed + "ppm, supportsColor=" + supportsColor + "]";
    }
}
