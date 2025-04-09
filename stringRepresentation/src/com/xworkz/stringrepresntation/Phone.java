package com.xworkz.stringrepresntation;

public class Phone {

    private String brand;
    private String os;
    private double screenSize;

    public Phone(String brand, String os, double screenSize) {
        this.brand = brand;
        this.os = os;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", os=" + os + ", screenSize=" + screenSize + " inches]";
    }
}

