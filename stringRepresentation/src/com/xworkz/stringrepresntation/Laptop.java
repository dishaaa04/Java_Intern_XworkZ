package com.xworkz.stringrepresntation;

public class Laptop {
    private String brand;
    private String processor;
    private int ramGB;

    public Laptop(String brand, String processor, int ramGB) {
        this.brand = brand;
        this.processor = processor;
        this.ramGB = ramGB;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", processor=" + processor + ", ramGB=" + ramGB + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 2900;
    }
}
