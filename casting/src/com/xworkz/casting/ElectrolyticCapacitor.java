package com.xworkz.casting;

public class ElectrolyticCapacitor extends Capacitor {

    @Override
    public void charge() {
        System.out.println("Electrolytic capacitor is charging with polarity.");
    }

    @Override
    public void discharge() {
        System.out.println("Electrolytic capacitor is discharging slowly.");
    }

    public void checkPolarity() {
        System.out.println("Checking polarity of the electrolytic capacitor.");
    }

    @Override
    public void type() {
        System.out.println("Type: Electrolytic Capacitor.");
    }
}
