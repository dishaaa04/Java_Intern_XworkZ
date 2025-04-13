package com.xworkz.stringrepresntation;

public class Pencil {
    private String brand;
    private String hardness;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pencil) {
            Pencil other = (Pencil) obj;
            return this.brand.equals(other.brand) && this.hardness.equals(other.hardness);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pencil{brand='" + brand + "', hardness='" + hardness + "'}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + hardness.hashCode();
    }
}
