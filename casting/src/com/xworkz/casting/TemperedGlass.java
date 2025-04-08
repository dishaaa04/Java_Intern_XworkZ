package com.xworkz.casting;

public class TemperedGlass extends Glass {

    @Override
    public void type() {
        System.out.println("Type: Tempered safety glass");
    }

    @Override
    public void thickness() {
        System.out.println("Thickness: 6mm");
    }

    public void impactResistance() {
        System.out.println("Impact Resistance: Very High");
    }
}
