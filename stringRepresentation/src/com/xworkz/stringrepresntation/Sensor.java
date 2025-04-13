package com.xworkz.stringrepresntation;

public class Sensor {
    private String type;
    private double range;
    private boolean isActive;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sensor) {
            Sensor other = (Sensor) obj;
            return this.type.equals(other.type)
                    && this.range == other.range
                    && this.isActive == other.isActive;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Sensor{type='" + type + "', range=" + range + ", isActive=" + isActive + "}";
    }

    @Override
    public int hashCode() {
        return type.hashCode() + Double.valueOf(range).hashCode() + Boolean.valueOf(isActive).hashCode();
    }
}
