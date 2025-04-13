package com.xworkz.stringrepresntation;

public class Sofa {
    private String material;
    private int seats;
    private String color;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sofa) {
            Sofa other = (Sofa) obj;
            return this.material.equals(other.material)
                    && this.seats == other.seats
                    && this.color.equals(other.color);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Sofa{material='" + material + "', seats=" + seats + ", color='" + color + "'}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + seats + color.hashCode();
    }
}
