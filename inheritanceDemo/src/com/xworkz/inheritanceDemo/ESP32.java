package com.xworkz.inheritanceDemo;

public class ESP32 extends Arduino {

    @Override
    public void powerOn() {
        System.out.println("ESP32 is powered on with dual-core processor");
    }

    @Override
    public void uploadCode() {
        System.out.println("ESP32 code is uploaded via USB or OTA");
    }

    @Override
    public void executeProgram() {
        System.out.println("ESP32 executes the program with Wi-Fi and Bluetooth support");
    }

    @Override
    public void readSensorData() {
        System.out.println("ESP32 reads sensor data and transmits it wirelessly");
    }

    @Override
    public void controlActuators() {
        System.out.println("ESP32 controls actuators and can send remote feedback");
    }

    public void connectWiFi() {
        System.out.println("ESP32 connects to a Wi-Fi network");
    }

    public void enableBluetooth() {
        System.out.println("ESP32 enables Bluetooth for communication");
    }

    public void performOTAUpdate() {
        System.out.println("ESP32 performs Over-the-Air firmware update");
    }

    public void sleepMode() {
        System.out.println("ESP32 enters low-power sleep mode");
    }
}
