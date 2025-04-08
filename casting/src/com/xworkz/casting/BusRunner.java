package com.xworkz.casting;

public class BusRunner {

    public static void main(String[] args) {

        Bus bus = new CityBus();
        bus.start();
        bus.stop();
        bus.type();
        bus.capacity();

        System.out.println("----");

        CityBus city = new CityBus();
        city.start();
        city.showRoute();
        city.type();
        city.stop();

        System.out.println("----");

        SmartCityBus smart = new SmartCityBus();
        smart.start();
        smart.showRoute();
        smart.type();

        System.out.println("----");

        smart.manageBus(new CityBus());
    }
}

