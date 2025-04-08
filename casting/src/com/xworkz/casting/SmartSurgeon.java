package com.xworkz.casting;

public class SmartSurgeon extends Surgeon {

    @Override
    public void treatPatient() {
        System.out.println("Smart Surgeon uses robotic tools to assist treatment.");
    }

    public void manageDoctor(Doctor doctor) {
        System.out.println("Managing doctor...");

        doctor.treatPatient();
        doctor.location();

        if (doctor instanceof Surgeon) {
            System.out.println("It's a Surgeon.");
            Surgeon surgeon = (Surgeon) doctor;
            surgeon.performSurgery();
            surgeon.specialization();
        }
    }
}
