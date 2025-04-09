package com.xworkz.stringrepresntation;

public class Remote {

    private String deviceType;
    private int batteryCount;
    private boolean isUniversal;

    public Remote(String deviceType, int batteryCount, boolean isUniversal) {
        this.deviceType = deviceType;
        this.batteryCount = batteryCount;
        this.isUniversal = isUniversal;
    }

    @Override
    public String toString() {
        return "[deviceType=" + deviceType + ", batteryCount=" + batteryCount + ", isUniversal=" + isUniversal + "]";
    }
}
