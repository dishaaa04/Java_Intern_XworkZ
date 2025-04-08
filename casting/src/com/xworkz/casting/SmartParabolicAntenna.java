package com.xworkz.casting;

public class SmartParabolicAntenna extends ParabolicAntenna {

    @Override
    public void transmit() {
        System.out.println("Smart antenna transmits using beamforming.");
    }

    public void manageAntenna(Antenna antenna) {
        System.out.println("Managing antenna...");

        antenna.transmit();
        antenna.frequencyRange();

        if (antenna instanceof ParabolicAntenna) {
            System.out.println("It is a parabolic antenna.");
            ParabolicAntenna parabolic = (ParabolicAntenna) antenna;
            parabolic.rotateDish();
            parabolic.type();
        }
    }
}
