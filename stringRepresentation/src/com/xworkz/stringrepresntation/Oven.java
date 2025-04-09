package com.xworkz.stringrepresntation;

public class Oven {

    private String type;
    private int capacity;
    private boolean isMicrowave;

    public Oven(String type, int capacity, boolean isMicrowave) {
        this.type = type;
        this.capacity = capacity;
        this.isMicrowave = isMicrowave;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", capacity=" + capacity + "L, isMicrowave=" + isMicrowave + "]";
    }
}
