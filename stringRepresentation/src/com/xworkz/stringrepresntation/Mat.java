package com.xworkz.stringrepresntation;

public class Mat {

    private String material;
    private String size;
    private boolean isWaterproof;

    public Mat(String material, String size, boolean isWaterproof) {
        this.material = material;
        this.size = size;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", isWaterproof=" + isWaterproof + "]";
    }
}
