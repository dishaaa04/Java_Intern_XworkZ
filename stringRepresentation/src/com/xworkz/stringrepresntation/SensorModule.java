package com.xworkz.stringrepresntation;

public class SensorModule {

    private String sensorType;
    private double range;
    private boolean isActive;

    public SensorModule(String sensorType, double range, boolean isActive) {
        this.sensorType = sensorType;
        this.range = range;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "[sensorType=" + sensorType + ", range=" + range + "m, isActive=" + isActive + "]";
    }
}
