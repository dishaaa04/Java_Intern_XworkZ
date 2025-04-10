package com.xworkz.stringrepresntation;

public class Jacket {
    private String material;
    private String size;
    private boolean isWaterproof;

    public Jacket(String material, String size, boolean isWaterproof) {
        this.material = material;
        this.size = size;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", isWaterproof=" + isWaterproof + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 2300;
    }
}
