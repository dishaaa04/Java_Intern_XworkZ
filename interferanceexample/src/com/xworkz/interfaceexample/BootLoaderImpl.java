package com.xworkz.interfaceexample;

public class BootLoaderImpl implements BootLoader {

    @Override
    public void loadOS() {
        System.out.println("Operating System is loading...");
    }

    @Override
    public void checkHardware() {
        System.out.println("Checking hardware components...");
    }

    @Override
    public void initializeDrivers() {
        System.out.println("Initializing drivers...");
    }
}
