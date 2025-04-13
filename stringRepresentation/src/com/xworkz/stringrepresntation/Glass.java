package com.xworkz.stringrepresntation;

public class Glass {
    private String shape;
    private String usage;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Glass) {
            Glass other = (Glass) obj;
            return this.shape.equals(other.shape) && this.usage.equals(other.usage);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Glass{shape='" + shape + "', usage='" + usage + "'}";
    }

    @Override
    public int hashCode() {
        return shape.hashCode() + usage.hashCode();
    }
}
