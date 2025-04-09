package com.xworkz.stringrepresntation;

public class Laptop {

    private String brand;
    private int ram;
    private String processor;

    public Laptop(String brand, int ram, String processor) {
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", ram=" + ram + "GB, processor=" + processor + "]";
    }
}
