package com.xworkz.casting;

public class ComputerRunner {

    public static void main(String[] args) {

        Computer computer = new LaptopComputer();
        computer.start();
        computer.shutdown();
        computer.processor();
        computer.storage();

        System.out.println("----");

        LaptopComputer laptop = new LaptopComputer();
        laptop.start();
        laptop.batteryStatus();
        laptop.processor();
        laptop.shutdown();

        System.out.println("----");

        SmartLaptopComputer smart = new SmartLaptopComputer();
        smart.start();
        smart.batteryStatus();
        smart.processor();

        System.out.println("----");

        smart.manageComputer(new LaptopComputer());
    }
}
