package com.xworkz.stringrepresntation;

public class Processor {
    private String brand;
    private int cores;
    private double speed;

    public Processor(String brand, int cores, double speed) {
        this.brand = brand;
        this.cores = cores;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", cores=" + cores + ", speed=" + speed + "GHz]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 4600;
    }
}
