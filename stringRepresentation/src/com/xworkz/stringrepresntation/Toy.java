package com.xworkz.stringrepresntation;

public class Toy {
    private String name;
    private String type;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Toy) {
            Toy other = (Toy) obj;
            return this.name.equals(other.name) &&
                    this.type.equals(other.type) &&
                    this.price == other.price;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Toy{name='" + name + "', type='" + type + "', price=" + price + "}";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + type.hashCode() + Double.valueOf(price).hashCode();
    }
}
