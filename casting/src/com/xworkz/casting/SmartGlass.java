package com.xworkz.casting;

public class SmartGlass extends TemperedGlass {

    @Override
    public void type() {
        System.out.println("Type: Electrochromic Smart Glass");
    }

    public void manageGlass(Glass glass) {
        System.out.println("Managing glass properties...");

        glass.material();
        glass.type();

        if (glass instanceof TemperedGlass) {
            System.out.println("It's TemperedGlass.");
            TemperedGlass tempered = (TemperedGlass) glass;
            tempered.impactResistance();
            tempered.thickness();
        }
    }
}
