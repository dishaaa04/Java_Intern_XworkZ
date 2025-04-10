package com.xworkz.stringrepresntation;

public class Camera {
    private String brand;
    private int resolution;
    private boolean hasFlash;

    public Camera(String brand, int resolution, boolean hasFlash) {
        this.brand = brand;
        this.resolution = resolution;
        this.hasFlash = hasFlash;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", resolution=" + resolution + "MP, hasFlash=" + hasFlash + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 222;
    }
}
