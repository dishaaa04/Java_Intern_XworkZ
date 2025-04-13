package com.xworkz.stringrepresntation;

public class Cycle {
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
            if (obj instanceof Cycle) {
                Cycle other = (Cycle) obj;
                return this.brand.equals(other.brand);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cycle{brand='" + brand + "'}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode();
    }
}
