package com.xworkz.stringrepresntation;

public class Bottle {
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bottle) {
            Bottle other = (Bottle) obj;
            return this.material.equals(other.material);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bottle{material='" + material + "'}";
    }

    @Override
    public int hashCode() {
        return material.hashCode();
    }
}
