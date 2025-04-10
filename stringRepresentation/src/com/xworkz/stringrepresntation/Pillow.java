package com.xworkz.stringrepresntation;

public class Pillow {
    private String material;
    private String size;
    private boolean isWashable;

    public Pillow(String material, String size, boolean isWashable) {
        this.material = material;
        this.size = size;
        this.isWashable = isWashable;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", isWashable=" + isWashable + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 4400;
    }
}
