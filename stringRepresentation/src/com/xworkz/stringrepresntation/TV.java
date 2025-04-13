package com.xworkz.stringrepresntation;

public class TV {
    private String brand;
    private String type;
    private int screenSize;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof TV) {
            TV other = (TV) obj;
            return this.brand.equals(other.brand) &&
                    this.type.equals(other.type) &&
                    this.screenSize == other.screenSize;
        }
        return false;
    }

    @Override
    public String toString() {
        return "TV{brand='" + brand + "', type='" + type + "', screenSize=" + screenSize + "}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + type.hashCode() + screenSize;
    }
}
