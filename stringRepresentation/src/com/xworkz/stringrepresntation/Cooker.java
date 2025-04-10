package com.xworkz.stringrepresntation;

public class Cooker {
    private String type;
    private int capacity;
    private boolean isElectric;

    public Cooker(String type, int capacity, boolean isElectric) {
        this.type = type;
        this.capacity = capacity;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", capacity=" + capacity + "L, isElectric=" + isElectric + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 1100;
    }
}
