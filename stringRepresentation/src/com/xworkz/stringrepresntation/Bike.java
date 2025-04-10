package com.xworkz.stringrepresntation;

public class Bike {
    private String model;
    private int engineCC;
    private double price;

    public Bike(String model, int engineCC, double price) {
        this.model = model;
        this.engineCC = engineCC;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[model=" + model + ", engineCC=" + engineCC + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 800;
    }
}
