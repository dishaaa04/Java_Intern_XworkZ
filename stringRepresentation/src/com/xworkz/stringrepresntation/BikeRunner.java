package com.xworkz.stringrepresntation;

public class BikeRunner {
    public static void main(String[] args) {
        Bike bike = new Bike("Royal Enfield", 350, 195000);
        String bikeString = bike.toString();
        System.out.println("bike = " + bikeString);

        int code = bike.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        String value = "helmet";
        System.out.println("helmet = " + value.hashCode());

        String value2 = "speed";
        System.out.println("speed = " + value2.hashCode());

        String value3 = "gear";
        System.out.println("gear = " + value3.hashCode());
    }
}
