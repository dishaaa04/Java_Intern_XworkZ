package com.xworkz.casting;

public class Orthodontist extends Dentist {

    @Override
    public void diagnose() {
        System.out.println("Orthodontist is diagnosing teeth alignment issues.");
    }

    @Override
    public void treat() {
        System.out.println("Orthodontist is fixing braces.");
    }

    public void applyBraces() {
        System.out.println("Applying braces to the patient.");
    }

    @Override
    public void location() {
        System.out.println("Clinic located in the dental care wing.");
    }
}
