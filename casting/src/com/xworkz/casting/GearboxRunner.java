package com.xworkz.casting;

public class GearboxRunner {

    public static void main(String[] args) {

        Gearbox gearbox = new AutomaticGearbox();
        gearbox.type();
        gearbox.gears();
        gearbox.transmission();
        gearbox.controlMethod();

        System.out.println("----");

        AutomaticGearbox auto = new AutomaticGearbox();
        auto.type();
        auto.shiftMode();
        auto.gears();
        auto.controlMethod();

        System.out.println("----");

        SmartGearbox smart = new SmartGearbox();
        smart.type();
        smart.shiftMode();
        smart.controlMethod();

        System.out.println("----");

        smart.manageGearbox(new AutomaticGearbox());
    }
}
