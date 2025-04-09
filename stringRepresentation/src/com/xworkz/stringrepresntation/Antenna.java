package com.xworkz.stringrepresntation;

public class Antenna {

    private String type;
    private double frequency;
    private boolean isDirectional;

    public Antenna(String type, double frequency, boolean isDirectional) {
        this.type = type;
        this.frequency = frequency;
        this.isDirectional = isDirectional;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", frequency=" + frequency + ", isDirectional=" + isDirectional + "]";
    }
}

