package com.xworkz.stringrepresntation;

public class SensorModule {
    private String model;
    private int numberOfSensors;
    private boolean isWireless;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfSensors() {
        return numberOfSensors;
    }

    public void setNumberOfSensors(int numberOfSensors) {
        this.numberOfSensors = numberOfSensors;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof SensorModule) {
            SensorModule other = (SensorModule) obj;
            return this.model.equals(other.model)
                    && this.numberOfSensors == other.numberOfSensors
                    && this.isWireless == other.isWireless;
        }
        return false;
    }

    @Override
    public String toString() {
        return "SensorModule{model='" + model + "', numberOfSensors=" + numberOfSensors + ", isWireless=" + isWireless + "}";
    }

    @Override
    public int hashCode() {
        return model.hashCode() + numberOfSensors + Boolean.valueOf(isWireless).hashCode();
    }
}
