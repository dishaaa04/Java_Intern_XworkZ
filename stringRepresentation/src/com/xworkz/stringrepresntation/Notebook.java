package com.xworkz.stringrepresntation;

public class Notebook {

    private String brand;
    private int pages;
    private boolean isRuled;

    public Notebook(String brand, int pages, boolean isRuled) {
        this.brand = brand;
        this.pages = pages;
        this.isRuled = isRuled;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", pages=" + pages + ", isRuled=" + isRuled + "]";
    }
}
