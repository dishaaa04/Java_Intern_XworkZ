package com.xworkz.stringrepresntation;


public class Button {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Button) {
                Button other = (Button) obj;
                return this.color.equals(other.color);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Button{color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }
}