package com.xworkz.stringrepresntation;

public class Fridge {
    private String model;
    private int capacity;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fridge) {
            Fridge other = (Fridge) obj;
            return this.model.equals(other.model) && this.capacity == other.capacity;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Fridge{model='" + model + "', capacity=" + capacity + "}";
    }

    @Override
    public int hashCode() {
        return model.hashCode() + capacity;
    }
}
