package com.xworkz.inheritanceDemo;

public class Bus extends Transport {

    public Bus() {
        super();
        System.out.println("Bus is ready for passengers");
    }

    @Override
    public void move() {
        System.out.println("Bus is moving on the road");
    }

    @Override
    public void stop() {
        System.out.println("Bus stopped at a bus stop");
    }

    @Override
    public void fuel() {
        System.out.println("Bus runs on diesel or CNG");
    }

    @Override
    public void capacity() {
        System.out.println("Bus can carry 50 passengers");
    }

    @Override
    public void route() {
        System.out.println("Bus follows a fixed route");
    }

    public void collectFare() {
        System.out.println("Bus conductor collects fare");
    }

    public void fixedStops() {
        System.out.println("Bus stops only at designated places");
    }

    public void driverAndConductor() {
        System.out.println("Bus has a driver and a conductor");
    }

    public void publicTransport() {
        System.out.println("Bus is a mode of public transport");
    }

    public void luggageSpace() {
        System.out.println("Bus provides space for luggage");
    }
}
