package com.xworkz.stringrepresntation;

public class Tap {
    private String type;
    private boolean isAutomatic;
    private double flowRate;

    public Tap(String type, boolean isAutomatic, double flowRate) {
        this.type = type;
        this.isAutomatic = isAutomatic;
        this.flowRate = flowRate;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", isAutomatic=" + isAutomatic + ", flowRate=" + flowRate + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 6100;
    }
}
