package com.xworkz.casting;

public class SmartElectronicDevice extends ElectronicDevice {

    @Override
    public void powerOn() {
        System.out.println("Smart electronic device turned on via voice command.");
    }

    public void manageDevice(Device device) {
        System.out.println("Managing device...");

        device.powerOn();
        device.brand();

        if (device instanceof ElectronicDevice) {
            System.out.println("It's an Electronic Device.");
            ElectronicDevice elec = (ElectronicDevice) device;
            elec.voltage();
            elec.type();
        }
    }
}
