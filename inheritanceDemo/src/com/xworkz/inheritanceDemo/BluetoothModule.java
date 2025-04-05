package com.xworkz.inheritanceDemo;

public class BluetoothModule extends IoTSensor {

    public BluetoothModule() {
        super();
        System.out.println("Bluetooth Module initialized");
    }

    @Override
    public void senseData() {
        System.out.println("Bluetooth Module senses nearby Bluetooth devices");
    }

    @Override
    public void transmitData() {
        System.out.println("Bluetooth Module transmits data wirelessly");
    }

    @Override
    public void calibrate() {
        System.out.println("Bluetooth Module adjusts frequency settings");
    }

    @Override
    public void connectToNetwork() {
        System.out.println("Bluetooth Module connects to paired devices");
    }

    @Override
    public void monitorEnvironment() {
        System.out.println("Bluetooth Module checks connection stability");
    }

    public void pairDevice() {
        System.out.println("Bluetooth Module pairs with another device");
    }

    public void enableVisibility() {
        System.out.println("Bluetooth Module enables visibility to other devices");
    }

    public void disconnect() {
        System.out.println("Bluetooth Module disconnects from a device");
    }

    public void scanDevices() {
        System.out.println("Bluetooth Module scans for available devices");
    }

    public void secureConnection() {
        System.out.println("Bluetooth Module ensures secure connection");
    }
}
