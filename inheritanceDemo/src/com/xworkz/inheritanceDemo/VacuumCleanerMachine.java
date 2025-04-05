package com.xworkz.inheritanceDemo;

public class VacuumCleanerMachine extends Appliance {

    public void startCleaning() {
        System.out.println("Vacuum cleaner starts cleaning the floor");
    }

    public void stopCleaning() {
        System.out.println("Vacuum cleaner stops cleaning");
    }

    public void emptyDustBag() {
        System.out.println("Dust bag is emptied after cleaning");
    }

    public void adjustSuctionPower() {
        System.out.println("Suction power adjusted for surface type");
    }

    public void changeCleaningMode() {
        System.out.println("Cleaning mode changed (carpet, hardwood, etc.)");
    }
}
