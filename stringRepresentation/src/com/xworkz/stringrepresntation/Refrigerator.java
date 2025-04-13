package com.xworkz.stringrepresntation;

public class Refrigerator {
    private String brand;
    private int capacity;
    private boolean isDoubleDoor;

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

    public boolean isDoubleDoor() {
        return isDoubleDoor;
    }

    public void setDoubleDoor(boolean isDoubleDoor) {
        this.isDoubleDoor = isDoubleDoor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Refrigerator) {
            Refrigerator other = (Refrigerator) obj;
            return this.brand.equals(other.brand)
                    && this.capacity == other.capacity
                    && this.isDoubleDoor == other.isDoubleDoor;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Refrigerator{brand='" + brand + "', capacity=" + capacity + ", doubleDoor=" + isDoubleDoor + "}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + capacity + Boolean.valueOf(isDoubleDoor).hashCode();
    }
}
