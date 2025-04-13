package com.xworkz.stringrepresntation;

public class Vase {
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Vase) {
            Vase other = (Vase) obj;
            return this.material.equals(other.material);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Vase{material='" + material + "'}";
    }

    @Override
    public int hashCode() {
        return material.hashCode();
    }
}
