package com.xworkz.interfaceexample;

public class DataTransmitterImpl implements DataTransmitter {

    boolean isTransmitting = false;

    @Override
    public void transmitData(String data) {
        isTransmitting = true;
        System.out.println("Transmitting data: " + data);
    }

    @Override
    public void showStatus() {
        if (isTransmitting) {
            System.out.println("Status: Data is being transmitted.");
        } else {
            System.out.println("Status: No transmission in progress.");
        }
    }

    @Override
    public void stopTransmission() {
        isTransmitting = false;
        System.out.println("Transmission stopped.");
    }
}
