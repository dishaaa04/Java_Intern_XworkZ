package com.xworkz.casting;

public class SmartWashingMachine extends WashingMachine {

    @Override
    public void turnOn() {
        System.out.println("Smart washing machine activated via app.");
    }

    public void manageAppliance(Appliance appliance) {
        System.out.println("Managing appliance...");

        appliance.turnOn();
        appliance.powerSource();

        if (appliance instanceof WashingMachine) {
            System.out.println("It's a Washing Machine.");
            WashingMachine wm = (WashingMachine) appliance;
            wm.washClothes();
            wm.type();
        }
    }
}
