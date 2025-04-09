package com.xworkz.stringrepresntation;

public class BikeRunner {

    private String model;
    private String brand;
    private double price;

    public BikeRunner(String model, String brand, double price) {
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[model=" + model + ", brand=" + brand + ", price=" + price + "]";
    }
}
