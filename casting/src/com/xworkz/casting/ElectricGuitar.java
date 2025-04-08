package com.xworkz.casting;

public class ElectricGuitar extends Guitar {

    @Override
    public void type() {
        System.out.println("Type: Electric Guitar");
    }

    @Override
    public void play() {
        System.out.println("Playing rock solos with distortion!");
    }

    public void connectAmp() {
        System.out.println("Connected to amplifier.");
    }
}

