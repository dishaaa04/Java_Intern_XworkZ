package com.xworkz.casting;

public class SmartHospital extends GovernmentHospital {

    @Override
    public void name() {
        System.out.println("Hospital Name: Smart AI-Enabled Hospital");
    }

    public void manageHospital(Hospital hospital) {
        System.out.println("Managing hospital operations...");

        hospital.name();
        hospital.location();

        if (hospital instanceof GovernmentHospital) {
            System.out.println("It's a GovernmentHospital.");
            GovernmentHospital gov = (GovernmentHospital) hospital;
            gov.subsidy();
            gov.capacity();
        }
    }
}
