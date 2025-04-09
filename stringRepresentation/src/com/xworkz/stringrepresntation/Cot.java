package com.xworkz.stringrepresntation;

public class Cot {

    private String material;
    private String size;
    private boolean hasHeadboard;

    public Cot(String material, String size, boolean hasHeadboard) {
        this.material = material;
        this.size = size;
        this.hasHeadboard = hasHeadboard;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", hasHeadboard=" + hasHeadboard + "]";
    }
}
