package com.xworkz.stringrepresntation;

public class Mouse {
    private String type;
    private boolean isWireless;
    private int dpi;

    public Mouse(String type, boolean isWireless, int dpi) {
        this.type = type;
        this.isWireless = isWireless;
        this.dpi = dpi;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", isWireless=" + isWireless + ", dpi=" + dpi + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 3400;
    }
}
