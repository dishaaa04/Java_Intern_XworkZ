package com.xworkz.inheritanceDemo;

public class Kettle extends Toaster {

    @Override
    public void powerOn() {
        System.out.println("Kettle is powered on to heat water");
    }

    @Override
    public void insertBread() {
        System.out.println("Kettle does not take bread; it fills with water");
    }

    @Override
    public void heatElements() {
        System.out.println("Kettle heats the water using internal coil");
    }

    @Override
    public void popUp() {
        System.out.println("Kettle doesn't pop; it auto shuts off after boiling");
    }

    @Override
    public void powerOff() {
        System.out.println("Kettle powers off automatically when water boils");
    }

    public void boilWater() {
        System.out.println("Kettle boils water quickly");
    }

    public void keepWarm() {
        System.out.println("Kettle keeps water warm for some time");
    }

    public void pourWater() {
        System.out.println("Kettle is used to pour hot water safely");
    }

    public void measureLevel() {
        System.out.println("Kettle shows water level through indicator");
    }
}
