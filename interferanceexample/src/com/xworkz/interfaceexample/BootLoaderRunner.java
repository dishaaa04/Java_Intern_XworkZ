package com.xworkz.interfaceexample;

public class BootLoaderRunner {
    public static void main(String[] args) {
        BootLoader bootLoader = new BootLoaderImpl();
        bootLoader.checkHardware();
        bootLoader.initializeDrivers();
        bootLoader.loadOS();
    }
}
