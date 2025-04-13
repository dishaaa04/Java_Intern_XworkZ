package com.xworkz.stringrepresntation;

public class Fan {
    private String brand;
    private int speed;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fan) {
            Fan other = (Fan) obj;
            return this.brand.equals(other.brand) && this.speed == other.speed;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Fan{brand='" + brand + "', speed=" + speed + "}";
    }

    @Override
    public int hashCode() {
        return brand.hashCode() + speed;
    }
}
