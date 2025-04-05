package com.xworkz.inheritanceDemo;

public class Dishwasher extends Oven {

    @Override
    public void powerOn() {
        System.out.println("Dishwasher is powered on and ready to clean");
    }

    @Override
    public void setTemperature() {
        System.out.println("Dishwasher sets water temperature for washing");
    }

    @Override
    public void cookFood() {
        System.out.println("Dishwasher doesn't cook food; it cleans dishes");
    }

    @Override
    public void turnOff() {
        System.out.println("Dishwasher is turned off after the cleaning cycle");
    }

    @Override
    public void openDoor() {
        System.out.println("Dishwasher door is opened to unload clean dishes");
    }

    public void loadDishes() {
        System.out.println("Dishes are loaded into the dishwasher racks");
    }

    public void addDetergent() {
        System.out.println("Dishwasher detergent is added before starting");
    }

    public void rinse() {
        System.out.println("Dishwasher rinses dishes with clean water");
    }

    public void dryDishes() {
        System.out.println("Dishwasher dries dishes using hot air");
    }
}
