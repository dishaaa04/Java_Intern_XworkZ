package com.xworkz.stringrepresntation;

public class Ring {

    private String material;
    private String size;
    private boolean hasGemstone;

    public Ring(String material, String size, boolean hasGemstone) {
        this.material = material;
        this.size = size;
        this.hasGemstone = hasGemstone;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", hasGemstone=" + hasGemstone + "]";
    }
}
