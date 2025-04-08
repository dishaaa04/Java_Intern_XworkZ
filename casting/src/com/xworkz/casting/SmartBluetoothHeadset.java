package com.xworkz.casting;

public class SmartBluetoothHeadset extends BluetoothHeadset {

    @Override
    public void connect() {
        System.out.println("Smart headset auto-connects to last paired device.");
    }

    public void manageBluetooth(Bluetooth bluetooth) {
        System.out.println("Managing Bluetooth device...");

        bluetooth.connect();
        bluetooth.range();

        if (bluetooth instanceof BluetoothHeadset) {
            System.out.println("It's a Bluetooth headset.");
            BluetoothHeadset headset = (BluetoothHeadset) bluetooth;
            headset.playAudio();
            headset.type();
        }
    }
}
