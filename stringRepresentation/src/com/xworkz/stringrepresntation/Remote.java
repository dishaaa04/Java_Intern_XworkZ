package com.xworkz.stringrepresntation;

public class Remote {
    private String type;
    private int buttons;
    private boolean isWireless;

    public Remote(String type, int buttons, boolean isWireless) {
        this.type = type;
        this.buttons = buttons;
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", buttons=" + buttons + ", isWireless=" + isWireless + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 4900;
    }
}
