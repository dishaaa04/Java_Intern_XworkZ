package com.xworkz.stringrepresntation;

public class Helmet {
    private String brand;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Helmet) {
            Helmet other = (Helmet) obj;
            return this.brand.equals(other.brand) && this.color.equals(other.color);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Helmet{brand='" + brand + "', color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + color.hashCode();
    }
}
