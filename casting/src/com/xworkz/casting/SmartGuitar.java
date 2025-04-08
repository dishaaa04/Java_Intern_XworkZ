package com.xworkz.casting;

public class SmartGuitar extends ElectricGuitar {

    @Override
    public void brand() {
        System.out.println("Brand: AI-Powered Smart Guitar");
    }

    public void manageGuitar(Guitar guitar) {
        System.out.println("Analyzing guitar...");

        guitar.brand();
        guitar.type();

        if (guitar instanceof ElectricGuitar) {
            System.out.println("It's an ElectricGuitar.");
            ElectricGuitar eg = (ElectricGuitar) guitar;
            eg.connectAmp();
            eg.play();
        }
    }
}
