package com.xworkz.stringrepresntation;

public class NetworkDevice {
    private String name;
    private String ipAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof NetworkDevice) {
            NetworkDevice other = (NetworkDevice) obj;
            return this.name.equals(other.name) && this.ipAddress.equals(other.ipAddress);
        }
        return false;
    }

    @Override
    public String toString() {
        return "NetworkDevice{name='" + name + "', ipAddress='" + ipAddress + "'}";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + ipAddress.hashCode();
    }
}
