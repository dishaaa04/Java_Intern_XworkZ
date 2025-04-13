package com.xworkz.stringrepresntation;

public class WallClock {
    private String shape;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof WallClock) {
            WallClock other = (WallClock) obj;
            return this.shape.equals(other.shape);
        }
        return false;
    }

    @Override
    public String toString() {
        return "WallClock{shape='" + shape + "'}";
    }

    @Override
    public int hashCode() {
        return shape.hashCode();
    }
}
