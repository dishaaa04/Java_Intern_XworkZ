package com.xworkz.stringrepresntation;

public class Car {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Car) {
                Car other = (Car) obj;
                return this.model.equals(other.model);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car{model='" + model + "'}";
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }
}
