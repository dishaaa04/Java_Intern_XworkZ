package com.xworkz.stringrepresntation;

public class Stick {
    private String type;
    private double length;
    private String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Stick) {
            Stick other = (Stick) obj;
            return this.type.equals(other.type)
                    && this.length == other.length
                    && this.color.equals(other.color);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Stick{type='" + type + "', length=" + length + ", color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        return type.hashCode() + Double.valueOf(length).hashCode() + color.hashCode();
    }
}
