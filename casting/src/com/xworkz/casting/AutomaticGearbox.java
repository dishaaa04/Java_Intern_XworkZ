package com.xworkz.casting;

public class AutomaticGearbox extends Gearbox {

    @Override
    public void type() {
        System.out.println("Type: Automatic Gearbox");
    }

    @Override
    public void gears() {
        System.out.println("Gears: 6-speed");
    }

    public void shiftMode() {
        System.out.println("Shift Mode: D, N, R, P");
    }

    @Override
    public void controlMethod() {
        System.out.println("Control Method: Electronic control");
    }
}
