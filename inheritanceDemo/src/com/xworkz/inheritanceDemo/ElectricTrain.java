package com.xworkz.inheritanceDemo;

public class ElectricTrain extends Electricity {
    ElectricTrain() {
        super();
        System.out.println("Electric Train class");
    }

    @Override
    public void generate() {
        System.out.println("Electric train receives generated electricity");
    }

    @Override
    public void transmit() {
        System.out.println("Electric train uses overhead lines to transmit electricity");
    }

    @Override
    public void store() {
        System.out.println("Electric train stores electricity in power units");
    }

    @Override
    public void shock() {
        System.out.println("Electric train systems are shock-protected");
    }

    @Override
    public void powerDevices() {
        System.out.println("Electric train uses electricity to run onboard systems");
    }

    public void startJourney() {
        System.out.println("Electric train is starting the journey");
    }

    public void increaseSpeed() {
        System.out.println("Electric train is increasing speed");
    }

    public void honk() {
        System.out.println("Electric train honks loudly");
    }

    public void stop() {
        System.out.println("Electric train stops at the station");
    }

    public void transportPeople() {
        System.out.println("Electric train transports people between cities");
    }
}
