package com.xworkz.stringrepresntation;

public class Camera {

    private String brand;
    private int resolution;
    private boolean isDSLR;

    public Camera(String brand, int resolution, boolean isDSLR) {
        this.brand = brand;
        this.resolution = resolution;
        this.isDSLR = isDSLR;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", resolution=" + resolution + "MP, isDSLR=" + isDSLR + "]";
    }
}
