package com.xworkz.stringrepresntation;

public class Pillow {

    private String material;
    private String size;
    private boolean isSoft;

    public Pillow(String material, String size, boolean isSoft) {
        this.material = material;
        this.size = size;
        this.isSoft = isSoft;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", isSoft=" + isSoft + "]";
    }
}
