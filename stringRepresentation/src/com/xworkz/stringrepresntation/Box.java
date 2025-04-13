package com.xworkz.stringrepresntation;

public class Box {
    private String shape;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Box) {
            Box other = (Box) obj;
            return this.shape.equals(other.shape);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Box{shape='" + shape + "'}";
    }

    @Override
    public int hashCode() {
        return shape.hashCode();
    }
}
