package com.xworkz.stringrepresntation;

public class Scissors {
    private String brand;
    private double length;
    private boolean isSharp;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isSharp() {
        return isSharp;
    }

    public void setSharp(boolean isSharp) {
        this.isSharp = isSharp;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Scissors) {
            Scissors other = (Scissors) obj;
            return this.brand.equals(other.brand)
                    && this.length == other.length
                    && this.isSharp == other.isSharp;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Scissors{brand='" + brand + "', length=" + length + ", isSharp=" + isSharp + "}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + Double.valueOf(length).hashCode() + Boolean.valueOf(isSharp).hashCode();
    }
}
