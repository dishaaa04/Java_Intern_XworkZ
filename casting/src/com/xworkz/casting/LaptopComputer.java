package com.xworkz.casting;

public class LaptopComputer extends Computer {

    @Override
    public void start() {
        System.out.println("Laptop is booting up with battery power.");
    }

    @Override
    public void shutdown() {
        System.out.println("Laptop is shutting down.");
    }

    public void batteryStatus() {
        System.out.println("Battery is at 85%.");
    }

    @Override
    public void processor() {
        System.out.println("Processor: AMD Ryzen 7.");
    }
}
