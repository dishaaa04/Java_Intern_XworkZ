package com.xworkz.stringrepresntation;

public class Keyboard {
    private String type;
    private boolean isWireless;
    private int keyCount;

    public Keyboard(String type, boolean isWireless, int keyCount) {
        this.type = type;
        this.isWireless = isWireless;
        this.keyCount = keyCount;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", isWireless=" + isWireless + ", keyCount=" + keyCount + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 2600;
    }
}
