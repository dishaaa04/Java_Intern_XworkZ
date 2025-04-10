package com.xworkz.stringrepresntation;

public class Soap {
    private String fragrance;
    private double weight;
    private boolean isMedicated;

    public Soap(String fragrance, double weight, boolean isMedicated) {
        this.fragrance = fragrance;
        this.weight = weight;
        this.isMedicated = isMedicated;
    }

    @Override
    public String toString() {
        return "[fragrance=" + fragrance + ", weight=" + weight + ", isMedicated=" + isMedicated + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 5500;
    }
}
