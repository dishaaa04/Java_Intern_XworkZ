package com.xworkz.stringrepresntation;

public class Lamp {

    private String type;
    private String color;
    private boolean isLED;

    public Lamp(String type, String color, boolean isLED) {
        this.type = type;
        this.color = color;
        this.isLED = isLED;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", color=" + color + ", isLED=" + isLED + "]";
    }
}

