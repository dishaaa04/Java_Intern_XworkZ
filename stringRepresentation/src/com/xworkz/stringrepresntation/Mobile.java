package com.xworkz.stringrepresntation;

public class Mobile {
    private String brand;
    private int storage;
    private boolean is5G;

    public Mobile(String brand, int storage, boolean is5G) {
        this.brand = brand;
        this.storage = storage;
        this.is5G = is5G;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", storage=" + storage + "GB, is5G=" + is5G + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 3300;
    }
}
