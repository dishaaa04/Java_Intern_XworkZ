package com.xworkz.stringrepresntation;

public class XeroxMachine {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof XeroxMachine) {
            XeroxMachine other = (XeroxMachine) obj;
            return this.brand.equals(other.brand);
        }
        return false;
    }

    @Override
    public String toString() {
        return "XeroxMachine{brand='" + brand + "'}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode();
    }
}
