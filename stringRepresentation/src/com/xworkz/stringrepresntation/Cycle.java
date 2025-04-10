package com.xworkz.stringrepresntation;

public class Cycle {
    private String brand;
    private int gears;
    private boolean hasBell;

    public Cycle(String brand, int gears, boolean hasBell) {
        this.brand = brand;
        this.gears = gears;
        this.hasBell = hasBell;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", gears=" + gears + ", hasBell=" + hasBell + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 1300;
    }
}
