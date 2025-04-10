package com.xworkz.stringrepresntation;

public class Antenna {
    private String type;
    private double frequency;
    private int length;

    public Antenna(String type, double frequency, int length) {
        this.type = type;
        this.frequency = frequency;
        this.length = length;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", frequency=" + frequency + ", length=" + length + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 120;
    }
}
