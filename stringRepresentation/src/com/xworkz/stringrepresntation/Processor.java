package com.xworkz.stringrepresntation;

public class Processor {

    private String model;
    private int cores;
    private double clockSpeed;

    public Processor(String model, int cores, double clockSpeed) {
        this.model = model;
        this.cores = cores;
        this.clockSpeed = clockSpeed;
    }

    @Override
    public String toString() {
        return "[model=" + model + ", cores=" + cores + ", clockSpeed=" + clockSpeed + "GHz]";
    }
}
