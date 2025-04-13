package com.xworkz.stringrepresntation;

public class Cot {
    private String woodType;

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Cot) {
                Cot other = (Cot) obj;
                return this.woodType.equals(other.woodType);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cot{woodType='" + woodType + "'}";
    }

    @Override
    public int hashCode() {
        return woodType.hashCode();
    }
}
