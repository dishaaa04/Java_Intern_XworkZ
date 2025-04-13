package com.xworkz.stringrepresntation;

public class Container {
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Container) {
                Container other = (Container) obj;
                return this.material.equals(other.material);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Container{material='" + material + "'}";
    }

    @Override
    public int hashCode() {
        return material.hashCode();
    }
}
