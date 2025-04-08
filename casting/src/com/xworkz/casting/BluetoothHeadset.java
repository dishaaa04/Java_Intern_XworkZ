package com.xworkz.casting;

public class BluetoothHeadset extends Bluetooth {

    @Override
    public void connect() {
        System.out.println("Bluetooth headset connected to phone.");
    }

    @Override
    public void disconnect() {
        System.out.println("Bluetooth headset disconnected.");
    }

    public void playAudio() {
        System.out.println("Playing audio in Bluetooth headset.");
    }

    @Override
    public void type() {
        System.out.println("Type: Bluetooth Headset.");
    }
}

