package com.xworkz.stringrepresntation;

public class Gate {
    private String material;
    private String type;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Gate) {
            Gate other = (Gate) obj;
            return this.material.equals(other.material) && this.type.equals(other.type);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Gate{material='" + material + "', type='" + type + "'}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + type.hashCode();
    }
}
