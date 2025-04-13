package com.xworkz.stringrepresntation;

public class CarRunner {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModel("Toyota");

        Car car2 = new Car();
        car2.setModel("Toyota");

        System.out.println("Checking same location: " + (car1 == car2));
        boolean same = car1.equals(car2);
        System.out.println("car1 is same as car2: " + same);
    }
}