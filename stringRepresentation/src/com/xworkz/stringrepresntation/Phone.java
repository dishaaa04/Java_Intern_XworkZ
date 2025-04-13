package com.xworkz.stringrepresntation;

public class Phone {
    private String model;
    private int price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Phone) {
            Phone other = (Phone) obj;
            return this.model.equals(other.model) && this.price == other.price;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Phone{model='" + model + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        return model.hashCode() + price;
    }
}
