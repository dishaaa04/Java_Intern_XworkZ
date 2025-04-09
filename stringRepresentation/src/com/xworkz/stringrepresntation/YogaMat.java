package com.xworkz.stringrepresntation;

public class YogaMat {

    private String brand;
    private double thickness;
    private boolean isEcoFriendly;

    public YogaMat(String brand, double thickness, boolean isEcoFriendly) {
        this.brand = brand;
        this.thickness = thickness;
        this.isEcoFriendly = isEcoFriendly;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", thickness=" + thickness + "mm, isEcoFriendly=" + isEcoFriendly + "]";
    }
}
