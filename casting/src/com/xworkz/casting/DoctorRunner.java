package com.xworkz.casting;

public class DoctorRunner {

    public static void main(String[] args) {

        Doctor doctor = new Surgeon();
        doctor.treatPatient();
        doctor.prescribeMedicine();
        doctor.specialization();
        doctor.location();

        System.out.println("----");

        Surgeon surgeon = new Surgeon();
        surgeon.treatPatient();
        surgeon.performSurgery();
        surgeon.specialization();
        surgeon.prescribeMedicine();

        System.out.println("----");

        SmartSurgeon smart = new SmartSurgeon();
        smart.treatPatient();
        smart.performSurgery();
        smart.specialization();

        System.out.println("----");

        smart.manageDoctor(new Surgeon());
    }
}
