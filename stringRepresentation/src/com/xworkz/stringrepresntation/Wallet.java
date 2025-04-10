package com.xworkz.stringrepresntation;

public class Wallet {
    private String color;
    private boolean hasChain;
    private double price;

    public Wallet(String color, boolean hasChain, double price) {
        this.color = color;
        this.hasChain = hasChain;
        this.price = price;
    }

    @Override
    public String toString() {
        return "[color=" + color + ", hasChain=" + hasChain + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 7500;
    }
}
