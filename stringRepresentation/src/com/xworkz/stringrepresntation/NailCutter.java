package com.xworkz.stringrepresntation;

public class NailCutter {
    private String material;
    private boolean hasFiler;
    private String size;

    public NailCutter(String material, boolean hasFiler, String size) {
        this.material = material;
        this.hasFiler = hasFiler;
        this.size = size;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", hasFiler=" + hasFiler + ", size=" + size + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 3500;
    }
}
