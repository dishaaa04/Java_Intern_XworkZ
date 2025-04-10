package com.xworkz.stringrepresntation;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new Car("Tesla Model 3", "Electric", 5);
        System.out.println("car = " + car.toString());

        int code = car.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("engine = " + "engine".hashCode());
        System.out.println("wheel = " + "wheel".hashCode());
        System.out.println("mirror = " + "mirror".hashCode());
    }
}
