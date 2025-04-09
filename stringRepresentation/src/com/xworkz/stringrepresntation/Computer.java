package com.xworkz.stringrepresntation;

public class Computer {

    private String brand;
    private int ram;
    private String processor;

    public Computer(String brand, int ram, String processor) {
        this.brand = brand;
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", ram=" + ram + "GB, processor=" + processor + "]";
    }
}
