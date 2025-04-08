package com.xworkz.casting;

public class SmartCityBus extends CityBus {

    @Override
    public void start() {
        System.out.println("Smart City Bus starts with GPS navigation.");
    }

    public void manageBus(Bus bus) {
        System.out.println("Managing bus...");

        bus.start();
        bus.capacity();

        if (bus instanceof CityBus) {
            System.out.println("It's a City Bus.");
            CityBus city = (CityBus) bus;
            city.showRoute();
            city.type();
        }
    }
}
