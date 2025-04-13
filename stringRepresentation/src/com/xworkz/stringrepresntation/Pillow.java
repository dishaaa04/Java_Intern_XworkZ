package com.xworkz.stringrepresntation;

public class Pillow {
    private String shape;
    private String fabric;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pillow) {
            Pillow other = (Pillow) obj;
            return this.shape.equals(other.shape) && this.fabric.equals(other.fabric);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Pillow{shape='" + shape + "', fabric='" + fabric + "'}";
    }

    @Override
    public int hashCode() {
        return shape.hashCode() + fabric.hashCode();
    }
}
