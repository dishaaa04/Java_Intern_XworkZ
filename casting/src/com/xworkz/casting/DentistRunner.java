package com.xworkz.casting;

public class DentistRunner {

    public static void main(String[] args) {

        Dentist dentist = new Orthodontist();
        dentist.diagnose();
        dentist.treat();
        dentist.location();
        dentist.fee();

        System.out.println("----");

        Orthodontist ortho = new Orthodontist();
        ortho.diagnose();
        ortho.applyBraces();
        ortho.location();
        ortho.treat();

        System.out.println("----");

        SmartOrthodontist smart = new SmartOrthodontist();
        smart.diagnose();
        smart.applyBraces();
        smart.location();

        System.out.println("----");

        smart.manageDentist(new Orthodontist());
    }
}
