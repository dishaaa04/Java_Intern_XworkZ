package com.xworkz.casting;

public class AntennaRunner {

    public static void main(String[] args) {

        Antenna antenna = new ParabolicAntenna();
        antenna.transmit();
        antenna.receive();
        antenna.type();
        antenna.frequencyRange();

        System.out.println("----");

        ParabolicAntenna parabolic = new ParabolicAntenna();
        parabolic.transmit();
        parabolic.receive();
        parabolic.rotateDish();
        parabolic.type();

        System.out.println("----");

        SmartParabolicAntenna smart = new SmartParabolicAntenna();
        smart.transmit();
        smart.receive();
        smart.rotateDish();
        smart.type();

        System.out.println("----");

        smart.manageAntenna(new ParabolicAntenna());
    }
}
