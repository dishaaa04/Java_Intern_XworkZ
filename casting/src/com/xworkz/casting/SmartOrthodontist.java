package com.xworkz.casting;

public class SmartOrthodontist extends Orthodontist {

    @Override
    public void diagnose() {
        System.out.println("Smart orthodontist uses AI to diagnose.");
    }

    public void manageDentist(Dentist dentist) {
        System.out.println("Managing dentist...");

        dentist.diagnose();
        dentist.fee();

        if (dentist instanceof Orthodontist) {
            System.out.println("It's an Orthodontist.");
            Orthodontist ortho = (Orthodontist) dentist;
            ortho.applyBraces();
            ortho.location();
        }
    }
}
