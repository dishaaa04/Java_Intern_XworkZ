package com.xworkz.stringrepresntation;

public class NailCutter {

    private String brand;
    private String material;
    private boolean hasFiler;

    public NailCutter(String brand, String material, boolean hasFiler) {
        this.brand = brand;
        this.material = material;
        this.hasFiler = hasFiler;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", material=" + material + ", hasFiler=" + hasFiler + "]";
    }
}

