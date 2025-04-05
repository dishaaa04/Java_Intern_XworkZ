package com.xworkz.inheritanceDemo;

public class RAM extends Microcontroller {

    public RAM() {
        super();
        System.out.println("RAM is initialized");
    }

    @Override
    public void controlDevices() {
        System.out.println("RAM does not control devices, it stores temporary data");
    }

    @Override
    public void executeProgram() {
        System.out.println("RAM provides space for programs to execute");
    }

    @Override
    public void communicate() {
        System.out.println("RAM communicates with CPU to store and retrieve data");
    }

    @Override
    public void managePower() {
        System.out.println("RAM requires continuous power to retain data");
    }

    @Override
    public void interactWithSensors() {
        System.out.println("RAM does not directly interact with sensors");
    }

    public void readData() {
        System.out.println("RAM reads data quickly");
    }

    public void writeData() {
        System.out.println("RAM writes data temporarily");
    }

    public void clearMemory() {
        System.out.println("RAM clears data when powered off");
    }

    public void provideBuffer() {
        System.out.println("RAM acts as a buffer between CPU and storage");
    }

    public void increasePerformance() {
        System.out.println("RAM increases the performance of a system");
    }
}
