package com.xworkz.stringrepresntation;

public class Toy {

    private String name;
    private String type;
    private boolean isBatteryOperated;

    public Toy(String name, String type, boolean isBatteryOperated) {
        this.name = name;
        this.type = type;
        this.isBatteryOperated = isBatteryOperated;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", type=" + type + ", isBatteryOperated=" + isBatteryOperated + "]";
    }
}
