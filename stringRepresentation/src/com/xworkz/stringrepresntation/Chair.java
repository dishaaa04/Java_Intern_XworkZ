package com.xworkz.stringrepresntation;

public class Chair {
    private String material;
    private String style;
    private boolean isFoldable;

    public Chair(String material, String style, boolean isFoldable) {
        this.material = material;
        this.style = style;
        this.isFoldable = isFoldable;
    }

    @Override
    public String toString() {
        return "[material=" + material + ", style=" + style + ", isFoldable=" + isFoldable + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 444;
    }
}
