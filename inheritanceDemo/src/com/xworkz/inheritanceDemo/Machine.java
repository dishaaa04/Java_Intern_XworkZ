package com.xworkz.inheritanceDemo;

public class Machine extends Robot {

    public Machine() {
        super();
        System.out.println("Machine is initialized");
    }

    @Override
    public void move() {
        System.out.println("Machine is moving faster");
    }

    @Override
    public void scanArea() {
        System.out.println("Machine is scanning with advanced sensors");
    }

    @Override
    public void pickObjects() {
        System.out.println("Machine is picking heavy objects");
    }

    @Override
    public void recharge() {
        System.out.println("Machine is charging wirelessly");
    }

    @Override
    public void stop() {
        System.out.println("Machine has stopped all operations");
    }

    public void recognizeSpeech() {
        System.out.println("Machine is recognizing speech");
    }

    public void processData() {
        System.out.println("Machine is processing data");
    }

    public void makeDecisions() {
        System.out.println("Machine is making decisions");
    }

    public void performFacialRecognition() {
        System.out.println("Machine is performing facial recognition");
    }

    public void automateTasks() {
        System.out.println("Machine is automating tasks");
    }
}
