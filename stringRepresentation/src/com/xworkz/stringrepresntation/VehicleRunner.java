package com.xworkz.stringrepresntation;

public class VehicleRunner {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Car", "Honda", 4);
        System.out.println("vehicle = " + vehicle.toString());

        int code = vehicle.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("transport = " + "transport".hashCode());
        System.out.println("drive = " + "drive".hashCode());
        System.out.println("engine = " + "engine".hashCode());
    }
}
