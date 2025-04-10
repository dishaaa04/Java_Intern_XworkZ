package com.xworkz.stringrepresntation;

public class Toy {
    private String name;
    private String type;
    private double price;

    public Toy(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", type=" + type + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 6600;
    }
}
