package com.xworkz.stringrepresntation;

public class Tap {
    private String type;
    private String material;
    private boolean isAutomatic;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isAutomatic() {
        return isAutomatic;
    }

    public void setAutomatic(boolean automatic) {
        isAutomatic = automatic;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tap) {
            Tap other = (Tap) obj;
            return this.type.equals(other.type)
                    && this.material.equals(other.material)
                    && this.isAutomatic == other.isAutomatic;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tap{type='" + type + "', material='" + material + "', isAutomatic=" + isAutomatic + "}";
    }

    @Override
    public int hashCode() {
        return type.hashCode() + material.hashCode() + Boolean.valueOf(isAutomatic).hashCode();
    }
}
