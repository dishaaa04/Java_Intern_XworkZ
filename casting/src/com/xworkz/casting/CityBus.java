package com.xworkz.casting;

public class CityBus extends Bus {

    @Override
    public void start() {
        System.out.println("City bus is starting in eco-mode.");
    }

    @Override
    public void stop() {
        System.out.println("City bus is stopping at a bus stop.");
    }

    public void showRoute() {
        System.out.println("Showing city route map.");
    }

    @Override
    public void type() {
        System.out.println("Type: City Bus.");
    }
}
