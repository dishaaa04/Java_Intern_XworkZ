package com.xworkz.stringrepresntation;

public class Camera {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Camera) {
                Camera other = (Camera) obj;
                return this.brand.equals(other.brand);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Camera{brand='" + brand + "'}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode();
    }
}