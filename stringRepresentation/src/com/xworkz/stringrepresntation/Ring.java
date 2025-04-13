package com.xworkz.stringrepresntation;

public class Ring {
    private String material;
    private double size;
    private boolean hasStone;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public boolean isHasStone() {
        return hasStone;
    }

    public void setHasStone(boolean hasStone) {
        this.hasStone = hasStone;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Ring) {
            Ring other = (Ring) obj;
            return this.material.equals(other.material)
                    && this.size == other.size
                    && this.hasStone == other.hasStone;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ring{material='" + material + "', size=" + size + ", hasStone=" + hasStone + "}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + Double.valueOf(size).hashCode() + Boolean.valueOf(hasStone).hashCode();
    }
}
