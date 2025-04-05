package com.xworkz.inheritanceDemo;

public class Microprocessor extends Computing {

    public Microprocessor() {
        super();
        System.out.println("Microprocessor is initialized");
    }

    @Override
    public void processData() {
        System.out.println("Microprocessor executes instructions to process data");
    }

    @Override
    public void storeData() {
        System.out.println("Microprocessor accesses memory to store data");
    }

    @Override
    public void performCalculation() {
        System.out.println("Microprocessor performs arithmetic and logic operations");
    }

    @Override
    public void displayOutput() {
        System.out.println("Microprocessor sends processed data for output");
    }

    @Override
    public void receiveInput() {
        System.out.println("Microprocessor gets input through buses and ports");
    }

    public void controlDevices() {
        System.out.println("Microprocessor controls peripheral devices");
    }

    public void fetchInstruction() {
        System.out.println("Microprocessor fetches instructions from memory");
    }

    public void decodeInstruction() {
        System.out.println("Microprocessor decodes the fetched instructions");
    }

    public void executeInstruction() {
        System.out.println("Microprocessor executes the decoded instructions");
    }

    public void manageClockCycle() {
        System.out.println("Microprocessor operates based on clock cycles");
    }
}
