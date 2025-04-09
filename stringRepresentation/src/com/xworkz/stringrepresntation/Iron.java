package com.xworkz.stringrepresntation;

public class Iron {

    private String brand;
    private int power;
    private boolean isSteamIron;

    public Iron(String brand, int power, boolean isSteamIron) {
        this.brand = brand;
        this.power = power;
        this.isSteamIron = isSteamIron;
    }

    @Override
    public String toString() {
        return "[brand=" + brand + ", power=" + power + "W, isSteamIron=" + isSteamIron + "]";
    }
}
