package com.xworkz.casting;

public class ElectricTrainRunner {

    public static void main(String[] args) {

        ElectricTrain train = new MetroTrain();
        train.start();
        train.stop();
        train.type();
        train.capacity();

        System.out.println("----");

        MetroTrain metro = new MetroTrain();
        metro.start();
        metro.route();
        metro.capacity();
        metro.stop();

        System.out.println("----");

        SmartMetroTrain smart = new SmartMetroTrain();
        smart.start();
        smart.route();
        smart.capacity();

        System.out.println("----");

        smart.manageTrain(new MetroTrain());
    }
}
