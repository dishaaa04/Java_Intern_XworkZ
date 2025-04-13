package com.xworkz.stringrepresntation;

public class Table {
    private String material;
    private int legs;
    private String shape;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Table) {
            Table other = (Table) obj;
            return this.material.equals(other.material)
                    && this.legs == other.legs
                    && this.shape.equals(other.shape);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Table{material='" + material + "', legs=" + legs + ", shape='" + shape + "'}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + legs + shape.hashCode();
    }
}
