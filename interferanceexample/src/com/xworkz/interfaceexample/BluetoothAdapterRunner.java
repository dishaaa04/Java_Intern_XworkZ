package com.xworkz.interfaceexample;

public class BluetoothAdapterRunner {
    public static void main(String[] args) {
        BluetoothAdapter adapter = new BluetoothAdapterImpl();
        adapter.connect();
        adapter.disconnect();
        adapter.scanDevices();
    }
}
