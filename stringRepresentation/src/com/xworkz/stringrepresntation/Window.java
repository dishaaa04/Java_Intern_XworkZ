package com.xworkz.stringrepresntation;

public class Window {

    private String material;
    private String type;
    private boolean hasGrill;

    public Window(String material, String type, boolean hasGrill) {
        this.material = material;
        this.type = type;
        this.hasGrill = hasGrill;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", type=" + type + ", hasGrill=" + hasGrill + "]";
    }
}
