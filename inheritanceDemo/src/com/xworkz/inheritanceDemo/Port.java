package com.xworkz.inheritanceDemo;

public class Port {

    public Port() {
        System.out.println("Port is initialized");
    }

    public void checkStatus() {
        System.out.println("Checking port status");
    }

    public void connect() {
        System.out.println("Port is connecting");
    }

    public void disconnect() {
        System.out.println("Port is disconnecting");
    }

    public void powerSupply() {
        System.out.println("Port provides power supply");
    }

    public void transferData() {
        System.out.println("Port is transferring data");
    }
}
