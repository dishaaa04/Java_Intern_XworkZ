package com.xworkz.inheritanceDemo;

public class PowerSupplyUnit extends Network {

    public PowerSupplyUnit() {
        super();
        System.out.println("PowerSupplyUnit is initialized");
    }

    @Override
    public void connectDevices() {
        System.out.println("PSU connects power cables to devices");
    }

    @Override
    public void transmitData() {
        System.out.println("PSU does not transmit data, only power");
    }

    @Override
    public void assignIP() {
        System.out.println("PSU does not assign IP");
    }

    @Override
    public void maintainStability() {
        System.out.println("PSU ensures stable power supply");
    }

    @Override
    public void enableCommunication() {
        System.out.println("PSU indirectly supports communication by powering devices");
    }

    public void convertACtoDC() {
        System.out.println("PSU converts AC power to DC");
    }

    public void controlVoltage() {
        System.out.println("PSU controls voltage levels");
    }

    public void powerOnSystem() {
        System.out.println("PSU powers on the entire system");
    }

    public void coolingFan() {
        System.out.println("PSU contains a cooling fan");
    }

    public void efficiencyRating() {
        System.out.println("PSU has an efficiency rating");
    }
}
