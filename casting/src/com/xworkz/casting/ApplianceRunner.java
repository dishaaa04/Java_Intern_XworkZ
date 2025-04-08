package com.xworkz.casting;

public class ApplianceRunner {

    public static void main(String[] args) {

        Appliance appliance = new WashingMachine();
        appliance.turnOn();
        appliance.turnOff();
        appliance.type();
        appliance.powerSource();

        System.out.println("----");

        WashingMachine wm = new WashingMachine();
        wm.turnOn();
        wm.washClothes();
        wm.type();
        wm.turnOff();

        System.out.println("----");

        SmartWashingMachine smartWM = new SmartWashingMachine();
        smartWM.turnOn();
        smartWM.washClothes();
        smartWM.type();

        System.out.println("----");

        smartWM.manageAppliance(new WashingMachine());
    }
}
