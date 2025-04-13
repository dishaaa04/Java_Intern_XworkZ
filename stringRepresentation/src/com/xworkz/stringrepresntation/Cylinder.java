package com.xworkz.stringrepresntation;

public class Cylinder {
    private String gasType;

    public String getGasType() {
        return gasType;
    }

    public void setGasType(String gasType) {
        this.gasType = gasType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Cylinder) {
                Cylinder other = (Cylinder) obj;
                return this.gasType.equals(other.gasType);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cylinder{gasType='" + gasType + "'}";
    }

    @Override
    public int hashCode() {
        return gasType.hashCode();
    }
}
