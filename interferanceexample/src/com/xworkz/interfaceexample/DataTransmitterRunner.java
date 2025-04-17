package com.xworkz.interfaceexample;

public class DataTransmitterRunner {
    public static void main(String[] args) {
        DataTransmitter transmitter = new DataTransmitterImpl();
        transmitter.showStatus();
        transmitter.transmitData("Sending data to server");
        transmitter.showStatus();
        transmitter.stopTransmission();
        transmitter.showStatus();
    }
}
