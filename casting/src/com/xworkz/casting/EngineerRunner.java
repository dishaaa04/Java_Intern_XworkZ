package com.xworkz.casting;

public class EngineerRunner {

    public static void main(String[] args) {

        Engineer engineer = new SoftwareEngineer();
        engineer.work();
        engineer.field();
        engineer.experience();
        engineer.location();

        System.out.println("----");

        SoftwareEngineer se = new SoftwareEngineer();
        se.work();
        se.techStack();
        se.field();
        se.location();

        System.out.println("----");

        SmartEngineer smart = new SmartEngineer();
        smart.work();
        smart.techStack();
        smart.field();

        System.out.println("----");

        smart.manageEngineer(new SoftwareEngineer());
    }
}
