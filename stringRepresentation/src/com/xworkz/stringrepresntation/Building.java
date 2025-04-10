package com.xworkz.stringrepresntation;

public class Building {
    private String type;
    private int floors;
    private boolean hasLift;

    public Building(String type, int floors, boolean hasLift) {
        this.type = type;
        this.floors = floors;
        this.hasLift = hasLift;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", floors=" + floors + ", hasLift=" + hasLift + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 490;
    }
}
