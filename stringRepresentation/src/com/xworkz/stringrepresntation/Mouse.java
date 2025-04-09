package com.xworkz.stringrepresntation;

public class Mouse {

    private String brand;
    private boolean isWireless;
    private int dpi;

    public Mouse(String brand, boolean isWireless, int dpi) {
        this.brand = brand;
        this.isWireless = isWireless;
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", isWireless=" + isWireless + ", dpi=" + dpi + "]";
    }
}
