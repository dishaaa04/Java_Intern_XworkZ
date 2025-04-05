package com.xworkz.inheritanceDemo;

public class Bluetooth extends IoTSensor {

    public void pair() {
        System.out.println("Bluetooth is pairing with another device");
    }

    public void connect() {
        System.out.println("Bluetooth is connected");
    }

    public void disconnect() {
        System.out.println("Bluetooth is disconnected");
    }

    public void scanDevices() {
        System.out.println("Bluetooth is scanning for nearby devices");
    }

    public void sendData() {
        System.out.println("Bluetooth is sending data");
    }
}
