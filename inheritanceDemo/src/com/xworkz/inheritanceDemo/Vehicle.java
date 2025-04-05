package com.xworkz.inheritanceDemo;

public class Vehicle {

    public Vehicle() {
        System.out.println("Vehicle is ready");
    }

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    public void fuel() {
        System.out.println("Vehicle needs fuel");
    }

    public void moves() {
        System.out.println("Vehicle is moving");
    }

    public void carry() {
        System.out.println("Vehicle is carrying passengers or goods");
    }
}
