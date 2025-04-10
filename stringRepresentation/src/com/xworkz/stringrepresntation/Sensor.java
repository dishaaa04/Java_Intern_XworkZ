package com.xworkz.stringrepresntation;

public class Sensor {
    private String type;
    private String unit;
    private double range;

    public Sensor(String type, String unit, double range) {
        this.type = type;
        this.unit = unit;
        this.range = range;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", unit=" + unit + ", range=" + range + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 5200;
    }
}
