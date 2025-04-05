package com.xworkz.inheritanceDemo;

public class IoTSensor extends BluetoothModule {

    @Override
    public void connectDevice() {
        System.out.println("IoTSensor connects to a device over a network via Bluetooth");
    }

    @Override
    public void transferData() {
        System.out.println("IoTSensor transfers sensor data to the connected device wirelessly");
    }

    @Override
    public void pairDevices() {
        System.out.println("IoTSensor pairs devices for IoT applications using Bluetooth");
    }

    @Override
    public void disconnectDevice() {
        System.out.println("IoTSensor disconnects the device after data transfer");
    }

    public void measureTemperature() {
        System.out.println("IoTSensor measures temperature");
    }

    public void measureHumidity() {
        System.out.println("IoTSensor measures humidity");
    }

    public void measureLightIntensity() {
        System.out.println("IoTSensor measures light intensity");
    }

    public void sendAlert() {
        System.out.println("IoTSensor sends alert based on sensor readings");
    }
}
