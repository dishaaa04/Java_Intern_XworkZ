package com.xworkz.inheritanceDemo;

public class Train {

    public Train() {
        System.out.println("Train is ready for journey");
    }

    public void announce() {
        System.out.println("Train is announcing next stop");
    }

    public void slowDown() {
        System.out.println("Train is slowing down");
    }

    public void speedUp() {
        System.out.println("Train is increasing speed");
    }

    public void stop() {
        System.out.println("Train is stopping at station");
    }

    public void start() {
        System.out.println("Train is starting the journey");
    }
}
