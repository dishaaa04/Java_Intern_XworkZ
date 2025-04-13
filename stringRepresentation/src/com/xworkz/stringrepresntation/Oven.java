package com.xworkz.stringrepresntation;

public class Oven {
    private String type;
    private int temperature;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Oven) {
            Oven other = (Oven) obj;
            return this.type.equals(other.type) && this.temperature == other.temperature;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Oven{type='" + type + "', temperature=" + temperature + "}";
    }

    @Override
    public int hashCode() {
        return type.hashCode() + temperature;
    }
}
