package com.xworkz.stringrepresntation;

public class Jacket {
    private String material;
    private String color;

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
        if (obj != null && obj instanceof Jacket) {
            Jacket other = (Jacket) obj;
            return this.material.equals(other.material) && this.color.equals(other.color);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Jacket{material='" + material + "', color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + color.hashCode();
    }
}
