package com.xworkz.stringrepresntation;

public class WaterBottle {
    private String material;
    private double capacity;
    private boolean isInsulated;

    public WaterBottle(String material, double capacity, boolean isInsulated) {
        this.material = material;
        this.capacity = capacity;
        this.isInsulated = isInsulated;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", capacity=" + capacity + ", isInsulated=" + isInsulated + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 7700;
    }
}
