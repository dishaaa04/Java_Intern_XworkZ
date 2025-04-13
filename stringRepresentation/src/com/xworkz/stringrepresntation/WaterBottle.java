package com.xworkz.stringrepresntation;

public class WaterBottle {
    private String capacity;

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WaterBottle) {
            WaterBottle other = (WaterBottle) obj;
            return this.capacity.equals(other.capacity);
        }
        return false;
    }

    @Override
    public String toString() {
        return "WaterBottle{capacity='" + capacity + "'}";
    }

    @Override
    public int hashCode() {
        return capacity.hashCode();
    }
}
