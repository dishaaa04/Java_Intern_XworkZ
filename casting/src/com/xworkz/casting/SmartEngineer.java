package com.xworkz.casting;

public class SmartEngineer extends SoftwareEngineer {

    @Override
    public void work() {
        System.out.println("Smart Engineer is automating tasks using AI tools.");
    }

    public void manageEngineer(Engineer engineer) {
        System.out.println("Managing engineer...");

        engineer.work();
        engineer.field();

        if (engineer instanceof SoftwareEngineer) {
            System.out.println("It's a SoftwareEngineer.");
            SoftwareEngineer se = (SoftwareEngineer) engineer;
            se.techStack();
            se.location();
        }
    }
}
