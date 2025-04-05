package com.xworkz.inheritanceDemo;

public class Doctor {
    Doctor() {
        System.out.println("Doctor is available for consultation");
    }

    public void diagnose() {
        System.out.println("Doctor is diagnosing the patient");
    }

    public void prescription() {
        System.out.println("Doctor is prescribing medicine");
    }

    public void check() {
        System.out.println("Doctor is checking vitals");
    }

    public void surgery() {
        System.out.println("Doctor is performing surgery");
    }

    public void medicine() {
        System.out.println("Doctor advises rest and recovery");
    }
}
