package com.xworkz.stringrepresntation;

public class Bike {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bike) {
            Bike other = (Bike) obj;
            return this.model.equals(other.model);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bike{model='" + model + "'}";
    }

    @Override
    public int hashCode() {
        return model.hashCode();
    }
}
