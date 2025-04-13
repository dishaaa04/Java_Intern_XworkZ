package com.xworkz.stringrepresntation;

public class YogaMat {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof YogaMat) {
            YogaMat other = (YogaMat) obj;
            return this.color.equals(other.color);
        }
        return false;
    }

    @Override
    public String toString() {
        return "YogaMat{color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }
}
