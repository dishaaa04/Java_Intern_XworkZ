package com.xworkz.inheritanceDemo;

public class RFIDTag extends SatelliteDish {

    public RFIDTag() {
        super();
        System.out.println("RFIDTag is initialized");
    }

    @Override
    public void receiveSignal() {
        System.out.println("RFIDTag receives signals from RFID reader");
    }

    @Override
    public void transmitSignal() {
        System.out.println("RFIDTag transmits identification data");
    }

    @Override
    public void adjustAngle() {
        System.out.println("RFIDTag does not require angle adjustment");
    }

    @Override
    public void detectChannel() {
        System.out.println("RFIDTag detects frequency channel automatically");
    }

    @Override
    public void provideConnection() {
        System.out.println("RFIDTag provides secure identification data");
    }

    public void storeData() {
        System.out.println("RFIDTag stores unique ID and data");
    }

    public void passiveOperation() {
        System.out.println("RFIDTag operates without internal power");
    }

    public void activateOnScan() {
        System.out.println("RFIDTag activates when scanned by reader");
    }

    public void shortRange() {
        System.out.println("RFIDTag works within a short range");
    }

    public void tagObject() {
        System.out.println("RFIDTag tags and identifies objects");
    }
}
