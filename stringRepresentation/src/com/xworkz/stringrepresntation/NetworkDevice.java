package com.xworkz.stringrepresntation;

public class NetworkDevice {

    private String deviceName;
    private String ipAddress;
    private boolean isManaged;

    public NetworkDevice(String deviceName, String ipAddress, boolean isManaged) {
        this.deviceName = deviceName;
        this.ipAddress = ipAddress;
        this.isManaged = isManaged;
    }

    @Override
    public String toString() {
        return "[deviceName=" + deviceName + ", ipAddress=" + ipAddress + ", isManaged=" + isManaged + "]";
    }
}
