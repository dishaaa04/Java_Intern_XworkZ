package com.xworkz.stringrepresntation;

public class Button {
    private String shape;
    private String color;
    private boolean isClickable;

    public Button(String shape, String color, boolean isClickable) {
        this.shape = shape;
        this.color = color;
        this.isClickable = isClickable;
    }

    @Override
    public String toString() {
        return "[shape=" + shape + ", color=" + color + ", isClickable=" + isClickable + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 111;
    }
}
