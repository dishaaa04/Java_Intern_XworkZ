package com.xworkz.casting;

public class GuitarRunner {

    public static void main(String[] args) {

        Guitar guitar = new ElectricGuitar();
        guitar.brand();
        guitar.type();
        guitar.strings();
        guitar.play();

        System.out.println("----");

        ElectricGuitar electric = new ElectricGuitar();
        electric.brand();
        electric.connectAmp();
        electric.type();
        electric.play();

        System.out.println("----");

        SmartGuitar smart = new SmartGuitar();
        smart.brand();
        smart.connectAmp();
        smart.play();

        System.out.println("----");

        smart.manageGuitar(new ElectricGuitar());
    }
}
