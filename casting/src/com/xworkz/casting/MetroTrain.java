package com.xworkz.casting;

public class MetroTrain extends ElectricTrain {

    @Override
    public void start() {
        System.out.println("Metro train is starting with automatic doors.");
    }

    @Override
    public void stop() {
        System.out.println("Metro train is stopping at the next station.");
    }

    public void route() {
        System.out.println("Route: Underground urban area.");
    }

    @Override
    public void capacity() {
        System.out.println("Capacity: 300 passengers.");
    }
}
