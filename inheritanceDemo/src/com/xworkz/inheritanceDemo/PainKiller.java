package com.xworkz.inheritanceDemo;

public class PainKiller extends Medicine {

    public PainKiller() {
        super();
        System.out.println("Painkiller is selected");
    }

    @Override
    public void cureIllness() {
        System.out.println("Painkiller relieves pain, not cures illness");
    }

    @Override
    public void dosage() {
        System.out.println("Painkiller dosage should be taken with caution");
    }

    @Override
    public void sideEffects() {
        System.out.println("Painkillers may cause drowsiness or nausea");
    }

    @Override
    public void expiryDate() {
        System.out.println("Painkiller must not be used past expiry date");
    }

    @Override
    public void storageConditions() {
        System.out.println("Painkillers should be kept in a cool, dry place");
    }

    public void relievePain() {
        System.out.println("Painkiller relieves mild to severe pain");
    }

    public void quickAction() {
        System.out.println("Painkiller acts quickly on pain");
    }

    public void overTheCounter() {
        System.out.println("Some painkillers are available over the counter");
    }

    public void differentStrengths() {
        System.out.println("Painkillers come in different strengths");
    }

    public void suitableForHeadache() {
        System.out.println("Painkillers are effective for headaches");
    }
}
