package com.xworkz.stringrepresntation;

public class Iron {
    private String brand;
    private int wattage;
    private boolean isSteamIron;

    public Iron(String brand, int wattage, boolean isSteamIron) {
        this.brand = brand;
        this.wattage = wattage;
        this.isSteamIron = isSteamIron;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", wattage=" + wattage + "W, isSteamIron=" + isSteamIron + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 2200;
    }
}
