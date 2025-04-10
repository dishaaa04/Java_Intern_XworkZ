package com.xworkz.stringrepresntation;

public class Car {
    private String model;
    private String fuelType;
    private int seats;

    public Car(String model, String fuelType, int seats) {
        this.model = model;
        this.fuelType = fuelType;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "[model=" + model + ", fuelType=" + fuelType + ", seats=" + seats + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 333;
    }
}
