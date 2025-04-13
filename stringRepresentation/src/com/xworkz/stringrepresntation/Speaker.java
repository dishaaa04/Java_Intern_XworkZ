package com.xworkz.stringrepresntation;

public class Speaker {
    private String brand;
    private boolean isBluetooth;
    private int powerOutput;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isBluetooth() {
        return isBluetooth;
    }

    public void setBluetooth(boolean isBluetooth) {
        this.isBluetooth = isBluetooth;
    }

    public int getPowerOutput() {
        return powerOutput;
    }

    public void setPowerOutput(int powerOutput) {
        this.powerOutput = powerOutput;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Speaker) {
            Speaker other = (Speaker) obj;
            return this.brand.equals(other.brand)
                    && this.isBluetooth == other.isBluetooth
                    && this.powerOutput == other.powerOutput;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Speaker{brand='" + brand + "', isBluetooth=" + isBluetooth + ", powerOutput=" + powerOutput + "}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + Boolean.valueOf(isBluetooth).hashCode() + powerOutput;
    }
}
