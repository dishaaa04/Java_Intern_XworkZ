package com.xworkz.stringrepresntation;

public class Spoon {

    private String material;
    private String size;
    private boolean isDisposable;

    public Spoon(String material, String size, boolean isDisposable) {
        this.material = material;
        this.size = size;
        this.isDisposable = isDisposable;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", size=" + size + ", isDisposable=" + isDisposable + "]";
    }
}
