package com.xworkz.stringrepresntation;

public class Lamp {
    private String type;
    private int wattage;
    private boolean isRechargeable;

    public Lamp(String type, int wattage, boolean isRechargeable) {
        this.type = type;
        this.wattage = wattage;
        this.isRechargeable = isRechargeable;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", wattage=" + wattage + "W, isRechargeable=" + isRechargeable + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 2800;
    }
}
