package com.xworkz.stringrepresntation;

public class Board {
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Board) {
            Board other = (Board) obj;
            return this.material.equals(other.material);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Board{material='" + material + "'}";
    }

    @Override
    public int hashCode() {
        return material.hashCode();
    }
}
