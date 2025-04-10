package com.xworkz.stringrepresntation;

public class Notebook {
    private String brand;
    private int pageCount;
    private String type;

    public Notebook(String brand, int pageCount, String type) {
        this.brand = brand;
        this.pageCount = pageCount;
        this.type = type;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", pageCount=" + pageCount + ", type=" + type + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 3700;
    }
}
