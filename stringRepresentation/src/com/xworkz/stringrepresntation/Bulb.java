package com.xworkz.stringrepresntation;

public class Bulb {
    private String wattage;

    public String getWattage() {
        return wattage;
    }

    public void setWattage(String wattage) {
        this.wattage = wattage;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Bulb) {
                Bulb other = (Bulb) obj;
                return this.wattage.equals(other.wattage);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bulb{wattage='" + wattage + "'}";
    }

    @Override
    public int hashCode() {
        return wattage.hashCode();
    }
}
