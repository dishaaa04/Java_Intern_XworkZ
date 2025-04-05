package com.xworkz.inheritanceDemo;

public class Mattress extends AirConditioner {

    @Override
    public void powerOn() {
        System.out.println("Mattress doesn’t require power to function normally");
    }

    @Override
    public void setTemperature() {
        System.out.println("Mattress maintains body comfort, not temperature settings");
    }

    @Override
    public void startCooling() {
        System.out.println("Mattress does not cool the room");
    }

    @Override
    public void swingFlaps() {
        System.out.println("Mattress is stationary and has no moving flaps");
    }

    @Override
    public void powerOff() {
        System.out.println("Mattress does not need to be turned off");
    }

    public void provideComfort() {
        System.out.println("Mattress provides comfort and support for sleep");
    }

    public void adjustFirmness() {
        System.out.println("Adjusting mattress firmness for better sleep");
    }

    public void supportSpine() {
        System.out.println("Mattress supports the spine and body posture");
    }

    public void changeCovers() {
        System.out.println("Changing mattress covers for hygiene");
    }
}
