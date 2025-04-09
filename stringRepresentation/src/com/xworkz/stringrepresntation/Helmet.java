package com.xworkz.stringrepresntation;

public class Helmet {

    private String brand;
    private String color;
    private boolean isFullFace;

    public Helmet(String brand, String color, boolean isFullFace) {
        this.brand = brand;
        this.color = color;
        this.isFullFace = isFullFace;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", color=" + color + ", isFullFace=" + isFullFace + "]";
    }
}
