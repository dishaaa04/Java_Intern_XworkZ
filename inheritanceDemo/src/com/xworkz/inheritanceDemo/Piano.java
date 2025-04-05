package com.xworkz.inheritanceDemo;

public class Piano extends Instrument {

    public Piano() {
        super();
        System.out.println("Piano is initialized");
    }

    @Override
    public void play() {
        System.out.println("Playing the piano with keys");
    }

    @Override
    public void tune() {
        System.out.println("Tuning the piano strings");
    }

    @Override
    public void repair() {
        System.out.println("Repairing the piano keys and hammers");
    }

    public void strum() {
        System.out.println("Strumming the piano strings softly");
    }

    public void adjustStrings() {
        System.out.println("Adjusting the piano string tension");
    }

    public void changeTones() {
        System.out.println("Changing the piano tones");
    }

    public void plugIn() {
        System.out.println("Plugging in the electric piano");
    }

    public void fingerpicking() {
        System.out.println("Using fingerpicking technique on piano (unusual!)");
    }
}
