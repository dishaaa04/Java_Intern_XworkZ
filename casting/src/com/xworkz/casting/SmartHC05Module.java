package com.xworkz.casting;

public class SmartHC05Module extends HC05Module {

    @Override
    public void powerOn() {
        System.out.println("Smart HC-05 auto-powers and connects to default device.");
    }

    public void manageModule(BluetoothModule module) {
        System.out.println("Managing Bluetooth module...");

        module.powerOn();
        module.dataRate();

        if (module instanceof HC05Module) {
            System.out.println("It's an HC-05 module.");
            HC05Module hc05 = (HC05Module) module;
            hc05.configureATMode();
            hc05.version();
        }
    }
}
