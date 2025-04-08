package com.xworkz.casting;

public class ElectronicDevice extends Device {

    @Override
    public void powerOn() {
        System.out.println("Electronic device is starting up.");
    }

    @Override
    public void powerOff() {
        System.out.println("Electronic device is shutting down.");
    }

    public void voltage() {
        System.out.println("Operating at 220V.");
    }

    @Override
    public void brand() {
        System.out.println("Brand: Samsung");
    }
}
