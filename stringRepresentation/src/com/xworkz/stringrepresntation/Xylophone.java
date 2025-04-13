package com.xworkz.stringrepresntation;

public class Xylophone {
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Xylophone) {
            Xylophone other = (Xylophone) obj;
            return this.material.equals(other.material);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Xylophone{material='" + material + "'}";
    }

    @Override
    public int hashCode() {
        return material.hashCode();
    }
}
