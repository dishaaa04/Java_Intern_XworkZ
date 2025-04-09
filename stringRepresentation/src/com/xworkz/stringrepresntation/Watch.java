package com.xworkz.stringrepresntation;

public class Watch {

    private String brand;
    private boolean isDigital;
    private double price;

    public Watch(String brand, boolean isDigital, double price) {
        this.brand = brand;
        this.isDigital = isDigital;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", isDigital=" + isDigital + ", price=" + price + "]";
    }
}
