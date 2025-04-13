package com.xworkz.stringrepresntation;

public class Mobile {
    private String brand;
    private int storage;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mobile) {
            Mobile other = (Mobile) obj;
            return this.brand.equals(other.brand) && this.storage == other.storage;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Mobile{brand='" + brand + "', storage=" + storage + "GB}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + storage;
    }
}
