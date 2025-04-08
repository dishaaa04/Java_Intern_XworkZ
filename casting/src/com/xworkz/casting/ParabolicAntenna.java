package com.xworkz.casting;

public class ParabolicAntenna extends Antenna {

    @Override
    public void transmit() {
        System.out.println("Parabolic antenna transmits focused signals.");
    }

    @Override
    public void receive() {
        System.out.println("Parabolic antenna receives high-gain signals.");
    }

    public void rotateDish() {
        System.out.println("Rotating the parabolic dish.");
    }

    @Override
    public void type() {
        System.out.println("Type: Parabolic antenna.");
    }
}
