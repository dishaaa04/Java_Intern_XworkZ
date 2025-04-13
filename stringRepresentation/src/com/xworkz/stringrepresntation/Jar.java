package com.xworkz.stringrepresntation;

public class Jar {
    private String material;
    private int capacity;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Jar) {
            Jar other = (Jar) obj;
            return this.material.equals(other.material) && this.capacity == other.capacity;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Jar{material='" + material + "', capacity=" + capacity + "}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + capacity;
    }
}
