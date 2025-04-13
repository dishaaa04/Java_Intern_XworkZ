package com.xworkz.stringrepresntation;

public class Tubelight {
    private String brand;
    private int wattage;
    private double length;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tubelight) {
            Tubelight other = (Tubelight) obj;
            return this.brand.equals(other.brand) &&
                    this.wattage == other.wattage &&
                    this.length == other.length;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tubelight{brand='" + brand + "', wattage=" + wattage + ", length=" + length + "}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + wattage + Double.valueOf(length).hashCode();
    }
}
