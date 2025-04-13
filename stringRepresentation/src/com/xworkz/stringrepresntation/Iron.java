package com.xworkz.stringrepresntation;

public class Iron {
    private String brand;
    private String type;

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

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Iron) {
            Iron other = (Iron) obj;
            return this.brand.equals(other.brand) && this.type.equals(other.type);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Iron{brand='" + brand + "', type='" + type + "'}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + type.hashCode();
    }
}
