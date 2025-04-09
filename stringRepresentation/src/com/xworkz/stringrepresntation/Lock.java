package com.xworkz.stringrepresntation;

public class Lock {

    private String type;
    private String brand;
    private boolean isDigital;

    public Lock(String type, String brand, boolean isDigital) {
        this.type = type;
        this.brand = brand;
        this.isDigital = isDigital;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", brand=" + brand + ", isDigital=" + isDigital + "]";
    }
}
