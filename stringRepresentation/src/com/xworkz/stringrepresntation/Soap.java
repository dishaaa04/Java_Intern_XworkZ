package com.xworkz.stringrepresntation;

public class Soap {
    private String brand;
    private String fragrance;
    private double weight;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFragrance() {
        return fragrance;
    }

    public void setFragrance(String fragrance) {
        this.fragrance = fragrance;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Soap) {
            Soap other = (Soap) obj;
            return this.brand.equals(other.brand)
                    && this.fragrance.equals(other.fragrance)
                    && this.weight == other.weight;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Soap{brand='" + brand + "', fragrance='" + fragrance + "', weight=" + weight + "}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + fragrance.hashCode() + Double.valueOf(weight).hashCode();
    }
}
