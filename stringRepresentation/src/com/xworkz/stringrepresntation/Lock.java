package com.xworkz.stringrepresntation;

public class Lock {
    private String material;
    private boolean isDigital;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isDigital() {
        return isDigital;
    }

    public void setDigital(boolean digital) {
        isDigital = digital;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lock) {
            Lock other = (Lock) obj;
            return this.material.equals(other.material) && this.isDigital == other.isDigital;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Lock{material='" + material + "', isDigital=" + isDigital + "}";
    }

    @Override
    public int hashCode() {
        return material.hashCode() + Boolean.hashCode(isDigital);
    }
}
