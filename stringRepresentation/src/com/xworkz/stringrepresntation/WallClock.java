package com.xworkz.stringrepresntation;

public class WallClock {
    private String shape;
    private String brand;
    private boolean isDigital;

    public WallClock(String shape, String brand, boolean isDigital) {
        this.shape = shape;
        this.brand = brand;
        this.isDigital = isDigital;
    }

    @Override
    public String toString() {
        return "[shape=" + shape + ", brand=" + brand + ", isDigital=" + isDigital + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 7400;
    }
}
