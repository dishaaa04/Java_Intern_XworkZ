package com.xworkz.tshirtexample;

public class Tshirt {
    private String color;
    private int size;
    private String brand;

    // Correct Getter and Setter
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // equals() method
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Tshirt) {
                Tshirt tshirt2 = (Tshirt) obj;
                return this.color.equals(tshirt2.color) &&
                        this.size == tshirt2.size &&
                        this.brand.equals(tshirt2.brand);
            }
        }
        return false;
    }

    // Optional but recommended: toString() and hashCode()
    @Override
    public String toString() {
        return "Tshirt{color='" + color + "', size=" + size + ", brand='" + brand + "'}";
    }

    @Override
    public int hashCode() {
        return color.hashCode() + size + brand.hashCode();
    }
}
