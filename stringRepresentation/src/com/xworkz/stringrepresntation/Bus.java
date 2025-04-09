package com.xworkz.stringrepresntation;

public class Bus {

    private String route;
    private int capacity;
    private String driverName;

    public Bus(String route, int capacity, String driverName) {
        this.route = route;
        this.capacity = capacity;
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return "[route=" + route + ", capacity=" + capacity + ", driverName=" + driverName + "]";
    }
}

