package com.xworkz.stringrepresntation;

public class Sensor {

    private String name;
    private String unit;
    private double range;

    public Sensor(String name, String unit, double range) {
        this.name = name;
        this.unit = unit;
        this.range = range;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", unit=" + unit + ", range=" + range + "]";
    }
}
