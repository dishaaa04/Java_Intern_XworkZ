package com.xworkz.stringrepresntation;

public class Knife {
    private String type;
    private String material;

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

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Knife) {
            Knife other = (Knife) obj;
            return this.type.equals(other.type) && this.material.equals(other.material);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Knife{type='" + type + "', material='" + material + "'}";
    }

    @Override
    public int hashCode() {
        return type.hashCode() + material.hashCode();
    }
}
