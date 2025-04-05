package com.xworkz.inheritanceDemo;

public class Engineer extends Job {

    public Engineer() {
        super();
        System.out.println("Engineer is hired");
    }

    @Override
    public void work() {
        System.out.println("Engineer is designing and developing software");
    }

    @Override
    public void attendMeetings() {
        System.out.println("Engineer attends sprint and stand-up meetings");
    }

    @Override
    public void receiveSalary() {
        System.out.println("Engineer receives salary through direct deposit");
    }

    @Override
    public void getPromotion() {
        System.out.println("Engineer gets promoted based on technical skills and contributions");
    }

    @Override
    public void takeLeave() {
        System.out.println("Engineer applies leave through the HR portal");
    }

    public void writeCode() {
        System.out.println("Engineer is writing clean code");
    }

    public void debug() {
        System.out.println("Engineer is debugging the application");
    }

    public void testSoftware() {
        System.out.println("Engineer is testing the software modules");
    }

    public void deployApplication() {
        System.out.println("Engineer is deploying the app to production");
    }

    public void collaborateWithTeam() {
        System.out.println("Engineer is collaborating with the team using Agile practices");
    }
}
