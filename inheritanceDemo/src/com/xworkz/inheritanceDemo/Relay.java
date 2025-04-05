package com.xworkz.inheritanceDemo;

public class Relay extends PCB {

    public Relay() {
        super();
        System.out.println("Relay is created");
    }

    @Override
    public void connectComponents() {
        System.out.println("Relay connects switching circuits");
    }

    @Override
    public void provideSupport() {
        System.out.println("Relay supports electrical switching");
    }

    @Override
    public void routeSignals() {
        System.out.println("Relay switches signal paths");
    }

    @Override
    public void holdCircuits() {
        System.out.println("Relay holds contacts and coil circuit");
    }

    @Override
    public void ensureInsulation() {
        System.out.println("Relay insulates high and low voltage sides");
    }

    public void switchCircuit() {
        System.out.println("Relay switches the circuit on or off");
    }

    public void useElectromagnet() {
        System.out.println("Relay uses an electromagnet for operation");
    }

    public void handleHighCurrent() {
        System.out.println("Relay handles high current loads");
    }

    public void autoControl() {
        System.out.println("Relay controls automation systems");
    }

    public void protectCircuit() {
        System.out.println("Relay provides circuit protection");
    }
}
