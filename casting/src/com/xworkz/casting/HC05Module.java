package com.xworkz.casting;

public class HC05Module extends BluetoothModule {

    @Override
    public void powerOn() {
        System.out.println("HC-05 module powered on and ready to pair.");
    }

    @Override
    public void powerOff() {
        System.out.println("HC-05 module has been turned off.");
    }

    public void configureATMode() {
        System.out.println("Entering AT command mode for HC-05.");
    }

    @Override
    public void version() {
        System.out.println("Bluetooth version: 2.0 for HC-05.");
    }
}
