package com.xworkz.stringrepresntation;

public class Thread {
    private String material;
    private String color;
    private double thickness;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Thread) {
            Thread other = (Thread) obj;
            return this.material.equals(other.material)
                    && this.color.equals(other.color)
                    && this.thickness == other.thickness;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Thread{material='" + material + "', color='" + color + "', thickness=" + thickness + "}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + color.hashCode() + Double.valueOf(thickness).hashCode();
    }
}
