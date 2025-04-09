package com.xworkz.stringrepresntation;

public class Glass {

    private String type;
    private double capacity;
    private boolean isTransparent;

    public Glass(String type, double capacity, boolean isTransparent) {
        this.type = type;
        this.capacity = capacity;
        this.isTransparent = isTransparent;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", capacity=" + capacity + "ml, isTransparent=" + isTransparent + "]";
    }
}
