package com.xworkz.casting;

public class SmartMetroTrain extends MetroTrain {

    @Override
    public void start() {
        System.out.println("Smart Metro Train starts with AI-based scheduling.");
    }

    public void manageTrain(ElectricTrain train) {
        System.out.println("Managing electric train...");

        train.start();
        train.type();

        if (train instanceof MetroTrain) {
            System.out.println("It's a MetroTrain.");
            MetroTrain metro = (MetroTrain) train;
            metro.route();
            metro.capacity();
        }
    }
}
