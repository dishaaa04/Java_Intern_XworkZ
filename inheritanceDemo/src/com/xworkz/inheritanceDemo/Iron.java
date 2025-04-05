package com.xworkz.inheritanceDemo;

public class Iron extends WashingMachine {

    @Override
    public void loadClothes() {
        System.out.println("Iron prepares clothes by flattening them for pressing");
    }

    @Override
    public void addDetergent() {
        System.out.println("Iron does not use detergent but requires proper temperature setting");
    }

    @Override
    public void startWashCycle() {
        System.out.println("Iron heats up to the desired level instead of starting a cycle");
    }

    @Override
    public void rinseClothes() {
        System.out.println("Iron may use steam instead of rinsing clothes");
    }

    @Override
    public void spinDry() {
        System.out.println("Iron removes wrinkles instead of drying clothes");
    }

    public void pressClothes() {
        System.out.println("Pressing clothes to remove wrinkles");
    }

    public void adjustTemperature() {
        System.out.println("Adjusting temperature based on fabric type");
    }

    public void useSteamFunction() {
        System.out.println("Using steam to soften stubborn wrinkles");
    }

    public void switchOff() {
        System.out.println("Turning off the iron after use");
    }
}
