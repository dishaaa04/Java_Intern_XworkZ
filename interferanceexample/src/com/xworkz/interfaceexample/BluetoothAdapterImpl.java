package com.xworkz.interfaceexample;

public class BluetoothAdapterImpl implements BluetoothAdapter {

    public void connect() {
        System.out.println("Bluetooth connected");
    }

    public void disconnect() {
        System.out.println("Bluetooth disconnected");
    }

    public void scanDevices() {
        System.out.println("Scanning for devices");
    }
}
