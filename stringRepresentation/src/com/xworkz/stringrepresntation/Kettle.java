package com.xworkz.stringrepresntation;

public class Kettle {
    private String brand;
    private int capacity;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Kettle) {
            Kettle other = (Kettle) obj;
            return this.brand.equals(other.brand) && this.capacity == other.capacity;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Kettle{brand='" + brand + "', capacity=" + capacity + "}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + capacity;
    }
}
