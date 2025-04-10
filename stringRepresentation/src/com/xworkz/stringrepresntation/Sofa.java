package com.xworkz.stringrepresntation;

public class Sofa {
    private String material;
    private int seats;
    private boolean hasRecliner;

    public Sofa(String material, int seats, boolean hasRecliner) {
        this.material = material;
        this.seats = seats;
        this.hasRecliner = hasRecliner;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", seats=" + seats + ", hasRecliner=" + hasRecliner + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 5600;
    }
}
