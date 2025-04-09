package com.xworkz.stringrepresntation;

public class TV {

    private String brand;
    private int size;
    private String resolution;

    public TV(String brand, int size, String resolution) {
        this.brand = brand;
        this.size = size;
        this.resolution = resolution;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", size=" + size + " inches, resolution=" + resolution + "]";
    }
}
