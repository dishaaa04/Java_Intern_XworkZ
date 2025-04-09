package com.xworkz.stringrepresntation;

public class Borewell {

    private String location;
    private int depth;
    private boolean hasMotor;

    public Borewell(String location, int depth, boolean hasMotor) {
        this.location = location;
        this.depth = depth;
        this.hasMotor = hasMotor;
    }

    @Override
    public String toString() {
        return "[location=" + location + ", depth=" + depth + ", hasMotor=" + hasMotor + "]";
    }
}
