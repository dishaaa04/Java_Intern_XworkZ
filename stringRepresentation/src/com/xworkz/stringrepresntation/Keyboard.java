package com.xworkz.stringrepresntation;

public class Keyboard {

    private String brand;
    private boolean isMechanical;
    private String layout;

    public Keyboard(String brand, boolean isMechanical, String layout) {
        this.brand = brand;
        this.isMechanical = isMechanical;
        this.layout = layout;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", isMechanical=" + isMechanical + ", layout=" + layout + "]";
    }
}

