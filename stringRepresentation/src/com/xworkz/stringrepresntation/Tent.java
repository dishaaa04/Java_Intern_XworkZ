package com.xworkz.stringrepresntation;

public class Tent {
    private String color;
    private int capacity;
    private boolean waterproof;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tent) {
            Tent other = (Tent) obj;
            return this.color.equals(other.color)
                    && this.capacity == other.capacity
                    && this.waterproof == other.waterproof;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tent{color='" + color + "', capacity=" + capacity + ", waterproof=" + waterproof + "}";
    }

    @Override
    public int hashCode() {
        return color.hashCode() + capacity + Boolean.valueOf(waterproof).hashCode();
    }
}
