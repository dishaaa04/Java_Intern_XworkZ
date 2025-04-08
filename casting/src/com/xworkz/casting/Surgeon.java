package com.xworkz.casting;

public class Surgeon extends Doctor {

    @Override
    public void treatPatient() {
        System.out.println("Surgeon is preparing for surgery.");
    }

    @Override
    public void prescribeMedicine() {
        System.out.println("Surgeon prescribes post-surgery medicine.");
    }

    public void performSurgery() {
        System.out.println("Surgeon is performing surgery.");
    }

    @Override
    public void specialization() {
        System.out.println("Specialization: Surgery");
    }
}

