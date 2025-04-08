package com.xworkz.casting;

public class GovernmentHospital extends Hospital {

    @Override
    public void name() {
        System.out.println("Hospital Name: District Government Hospital");
    }

    @Override
    public void capacity() {
        System.out.println("Capacity: 1000 beds");
    }

    public void subsidy() {
        System.out.println("Government Subsidy: Yes");
    }
}
