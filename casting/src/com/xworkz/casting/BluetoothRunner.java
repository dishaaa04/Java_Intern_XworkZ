package com.xworkz.casting;

public class BluetoothRunner {

    public static void main(String[] args) {

        Bluetooth bluetooth = new BluetoothHeadset();
        bluetooth.connect();
        bluetooth.disconnect();
        bluetooth.type();
        bluetooth.range();

        System.out.println("----");

        BluetoothHeadset headset = new BluetoothHeadset();
        headset.connect();
        headset.playAudio();
        headset.type();
        headset.disconnect();

        System.out.println("----");

        SmartBluetoothHeadset smart = new SmartBluetoothHeadset();
        smart.connect();
        smart.playAudio();
        smart.type();

        System.out.println("----");

        smart.manageBluetooth(new BluetoothHeadset());
    }
}
