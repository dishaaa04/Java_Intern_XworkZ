package com.xworkz.stringrepresntation;

public class NetworkDevice {
    private String deviceType;
    private String ipAddress;
    private boolean isActive;

    public NetworkDevice(String deviceType, String ipAddress, boolean isActive) {
        this.deviceType = deviceType;
        this.ipAddress = ipAddress;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "[deviceType=" + deviceType + ", ipAddress=" + ipAddress + ", isActive=" + isActive + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 3600;
    }
}
