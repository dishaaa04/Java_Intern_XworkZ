package com.xworkz.stringrepresntation;

public class Borewell {
    private String location;
    private int depth;
    private boolean isWorking;

    public Borewell(String location, int depth, boolean isWorking) {
        this.location = location;
        this.depth = depth;
        this.isWorking = isWorking;
    }

    @Override
    public String toString() {
        return "[location=" + location + ", depth=" + depth + ", isWorking=" + isWorking + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 385;
    }
}
