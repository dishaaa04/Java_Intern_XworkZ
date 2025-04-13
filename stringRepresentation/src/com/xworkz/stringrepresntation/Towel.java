package com.xworkz.stringrepresntation;

public class Towel {
    private String size;
    private String material;
    private String color;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

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

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Towel) {
            Towel other = (Towel) obj;
            return this.size.equals(other.size)
                    && this.material.equals(other.material)
                    && this.color.equals(other.color);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Towel{size='" + size + "', material='" + material + "', color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        return size.hashCode() + material.hashCode() + color.hashCode();
    }
}
