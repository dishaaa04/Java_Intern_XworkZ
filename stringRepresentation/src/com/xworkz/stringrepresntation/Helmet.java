package com.xworkz.stringrepresntation;

public class Helmet {
    private String brand;
    private String size;
    private boolean isFullFace;

    public Helmet(String brand, String size, boolean isFullFace) {
        this.brand = brand;
        this.size = size;
        this.isFullFace = isFullFace;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", size=" + size + ", isFullFace=" + isFullFace + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 2100;
    }
}
