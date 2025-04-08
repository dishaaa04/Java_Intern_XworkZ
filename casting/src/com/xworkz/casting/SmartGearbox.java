package com.xworkz.casting;

public class SmartGearbox extends AutomaticGearbox {

    @Override
    public void type() {
        System.out.println("Type: Smart Gearbox with AI control");
    }

    public void manageGearbox(Gearbox gearbox) {
        System.out.println("Managing gearbox behavior...");

        gearbox.type();
        gearbox.transmission();

        if (gearbox instanceof AutomaticGearbox) {
            System.out.println("It's an AutomaticGearbox.");
            AutomaticGearbox auto = (AutomaticGearbox) gearbox;
            auto.shiftMode();
            auto.controlMethod();
        }
    }
}
