package com.xworkz.stringrepresntation;

public class Bus {
    private String number;
    private int capacity;
    private String route;

    public Bus(String number, int capacity, String route) {
        this.number = number;
        this.capacity = capacity;
        this.route = route;
    }

    @Override
    public String toString() {
        return "[number=" + number + ", capacity=" + capacity + ", route=" + route + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 360;
    }
}
