package com.xworkz.casting;

public class GlassRunner {

    public static void main(String[] args) {

        Glass glass = new TemperedGlass();
        glass.material();
        glass.type();
        glass.transparency();
        glass.thickness();

        System.out.println("----");

        TemperedGlass tempered = new TemperedGlass();
        tempered.type();
        tempered.impactResistance();
        tempered.thickness();
        tempered.transparency();

        System.out.println("----");

        SmartGlass smart = new SmartGlass();
        smart.type();
        smart.impactResistance();
        smart.thickness();

        System.out.println("----");

        smart.manageGlass(new TemperedGlass());
    }
}
