package com.xworkz.stringrepresntation;

public class Tap {

    private String material;
    private String type;
    private boolean isAutomatic;

    public Tap(String material, String type, boolean isAutomatic) {
        this.material = material;
        this.type = type;
        this.isAutomatic = isAutomatic;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", type=" + type + ", isAutomatic=" + isAutomatic + "]";
    }
}
