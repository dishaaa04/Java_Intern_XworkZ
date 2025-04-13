package com.xworkz.stringrepresntation;

public class NailCutter {
    private String brand;
    private String material;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof NailCutter) {
            NailCutter other = (NailCutter) obj;
            return this.brand.equals(other.brand) && this.material.equals(other.material);
        }
        return false;
    }

    @Override
    public String toString() {
        return "NailCutter{brand='" + brand + "', material='" + material + "'}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + material.hashCode();
    }
}
