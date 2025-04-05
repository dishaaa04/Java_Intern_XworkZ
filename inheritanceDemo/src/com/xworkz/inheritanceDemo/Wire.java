package com.xworkz.inheritanceDemo;

public class Wire extends Port {

    public Wire() {
        System.out.println("Wire is initialized");
    }

    @Override
    public void checkStatus() {
        System.out.println("Wire status is stable");
    }

    @Override
    public void connect() {
        System.out.println("Wire is connected to port");
    }

    @Override
    public void disconnect() {
        System.out.println("Wire is disconnected from port");
    }

    @Override
    public void powerSupply() {
        System.out.println("Wire carries power to device");
    }

    @Override
    public void transferData() {
        System.out.println("Wire transfers data efficiently");
    }

    public void ensureDurability() {
        System.out.println("Wire is durable");
    }

    public void flexibleUsage() {
        System.out.println("Wire can be used flexibly");
    }

    public void secureConnection() {
        System.out.println("Wire ensures secure connection");
    }

    public void shieldNoise() {
        System.out.println("Wire shields against noise");
    }

    public void transmitSignal() {
        System.out.println("Wire transmits signals accurately");
    }
}
