package com.xworkz.stringrepresntation;

public class Cooker {
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
            if (obj instanceof Cooker) {
                Cooker other = (Cooker) obj;
                return this.brand.equals(other.brand);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cooker{brand='" + brand + "'}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode();
    }
}
