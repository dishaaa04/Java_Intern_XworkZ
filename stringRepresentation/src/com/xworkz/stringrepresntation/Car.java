package com.xworkz.stringrepresntation;

public class Car {

    private String brand;
    private String model;
    private double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", model=" + model + ", price=" + price + "]";
    }
}
