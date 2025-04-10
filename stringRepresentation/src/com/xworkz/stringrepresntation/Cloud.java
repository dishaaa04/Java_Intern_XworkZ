package com.xworkz.stringrepresntation;

public class Cloud {
    private String type;
    private double altitude;
    private boolean isRaining;

    public Cloud(String type, double altitude, boolean isRaining) {
        this.type = type;
        this.altitude = altitude;
        this.isRaining = isRaining;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", altitude=" + altitude + "km, isRaining=" + isRaining + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 666;
    }
}
