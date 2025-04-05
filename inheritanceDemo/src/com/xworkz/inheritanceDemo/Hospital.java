package com.xworkz.inheritanceDemo;

public class Hospital {

    public Hospital() {
        System.out.println("Hospital is initialized");
    }

    public void admitPatient() {
        System.out.println("Admitting patient to hospital");
    }

    public void provideTreatment() {
        System.out.println("Providing general treatment");
    }

    public void performSurgery() {
        System.out.println("Performing surgery");
    }

    public void generateBill() {
        System.out.println("Generating hospital bill");
    }

    public void dischargePatient() {
        System.out.println("Discharging patient from hospital");
    }
}
