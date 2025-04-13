package com.xworkz.stringrepresntation;

public class Clock {
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
            if (obj instanceof Clock) {
                Clock other = (Clock) obj;
                return this.brand.equals(other.brand);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Clock{brand='" + brand + "'}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode();
    }
}
