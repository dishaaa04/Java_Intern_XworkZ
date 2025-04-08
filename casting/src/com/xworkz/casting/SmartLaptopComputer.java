package com.xworkz.casting;

public class SmartLaptopComputer extends LaptopComputer {

    @Override
    public void start() {
        System.out.println("Smart laptop is starting with face recognition.");
    }

    public void manageComputer(Computer computer) {
        System.out.println("Managing computer...");

        computer.start();
        computer.storage();

        if (computer instanceof LaptopComputer) {
            System.out.println("It's a Laptop Computer.");
            LaptopComputer laptop = (LaptopComputer) computer;
            laptop.batteryStatus();
            laptop.processor();
        }
    }
}

