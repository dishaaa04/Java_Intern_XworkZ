package com.xworkz.stringrepresntation;

public class Processor {
    private String brand;
    private int cores;
    private double frequency;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Processor) {
            Processor other = (Processor) obj;
            return this.brand.equals(other.brand)
                    && this.cores == other.cores
                    && this.frequency == other.frequency;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Processor{brand='" + brand + "', cores=" + cores + ", frequency=" + frequency + "GHz}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + cores + Double.valueOf(frequency).hashCode();
    }
}
