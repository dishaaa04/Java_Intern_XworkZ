package com.xworkz.stringrepresntation;

public class Television {
    private String brand;
    private int size;
    private boolean isSmart;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Television) {
            Television other = (Television) obj;
            return this.brand.equals(other.brand)
                    && this.size == other.size
                    && this.isSmart == other.isSmart;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Television{brand='" + brand + "', size=" + size + ", isSmart=" + isSmart + "}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + size + Boolean.valueOf(isSmart).hashCode();
    }
}
