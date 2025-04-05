package com.xworkz.inheritanceDemo;

public class Dentist extends Hospital {

    public Dentist() {
        super();
        System.out.println("Dentist department is initialized");
    }

    @Override
    public void provideTreatment() {
        System.out.println("Providing dental treatment");
    }

    @Override
    public void performSurgery() {
        System.out.println("Performing tooth extraction surgery");
    }

    @Override
    public void generateBill() {
        System.out.println("Generating dentist-specific bill");
    }

    public void cleanTeeth() {
        System.out.println("Cleaning teeth");
    }

    public void fillCavities() {
        System.out.println("Filling cavities");
    }

    public void extractTooth() {
        System.out.println("Extracting tooth");
    }

    public void provideBraces() {
        System.out.println("Providing braces");
    }

    public void performRootCanal() {
        System.out.println("Performing root canal treatment");
    }
}
