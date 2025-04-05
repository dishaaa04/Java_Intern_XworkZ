package com.xworkz.inheritanceDemo;

public class Patient extends Doctor {
    Patient() {
        super();
        System.out.println("Patient is consulting the doctor");
    }

    @Override
    public void diagnose() {
        System.out.println("Patient describes symptoms for diagnosis");
    }

    @Override
    public void prescription() {
        System.out.println("Patient receives a prescription");
    }

    @Override
    public void check() {
        System.out.println("Patient is getting vitals checked");
    }

    @Override
    public void surgery() {
        System.out.println("Patient undergoes surgery");
    }

    @Override
    public void medicine() {
        System.out.println("Patient follows medicine schedule");
    }

    public void disease() {
        System.out.println("Patient describes symptoms");
    }

    public void rest() {
        System.out.println("Patient takes prescribed medicine");
    }

    public void treatment() {
        System.out.println("Patient follows doctor's instructions");
    }

    public void takeMedicine() {
        System.out.println("Patient is resting as advised");
    }

    public void visitHospital() {
        System.out.println("Patient attends follow-up appointment");
    }
}
