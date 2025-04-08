package com.xworkz.casting;

public class HospitalRunner {

    public static void main(String[] args) {

        Hospital hospital = new GovernmentHospital();
        hospital.name();
        hospital.location();
        hospital.capacity();
        hospital.emergencyService();

        System.out.println("----");

        GovernmentHospital govt = new GovernmentHospital();
        govt.name();
        govt.subsidy();
        govt.capacity();
        govt.emergencyService();

        System.out.println("----");

        SmartHospital smart = new SmartHospital();
        smart.name();
        smart.subsidy();
        smart.capacity();

        System.out.println("----");

        smart.manageHospital(new GovernmentHospital());
    }
}

