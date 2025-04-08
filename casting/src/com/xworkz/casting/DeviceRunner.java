package com.xworkz.casting;

public class DeviceRunner {

    public static void main(String[] args) {

        Device device = new ElectronicDevice();
        device.powerOn();
        device.powerOff();
        device.type();
        device.brand();

        System.out.println("----");

        ElectronicDevice elec = new ElectronicDevice();
        elec.powerOn();
        elec.voltage();
        elec.brand();
        elec.powerOff();

        System.out.println("----");

        SmartElectronicDevice smart = new SmartElectronicDevice();
        smart.powerOn();
        smart.voltage();
        smart.brand();

        System.out.println("----");

        smart.manageDevice(new ElectronicDevice());
    }
}
