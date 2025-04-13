package com.xworkz.stringrepresntation;

public class Laptop {
    private String brand;
    private int ram;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Laptop) {
            Laptop other = (Laptop) obj;
            return this.brand.equals(other.brand) && this.ram == other.ram;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Laptop{brand='" + brand + "', ram=" + ram + "}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + ram;
    }
}
