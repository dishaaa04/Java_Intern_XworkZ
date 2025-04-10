package com.xworkz.stringrepresntation;

public class Oven {
    private String type;
    private int capacity;
    private boolean hasGrill;

    public Oven(String type, int capacity, boolean hasGrill) {
        this.type = type;
        this.capacity = capacity;
        this.hasGrill = hasGrill;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", capacity=" + capacity + "L, hasGrill=" + hasGrill + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 3900;
    }
}
