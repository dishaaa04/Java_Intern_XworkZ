package com.xworkz.casting;

public class ConveyorBeltRunner {

    public static void main(String[] args) {

        ConveyorBelt belt = new IndustrialConveyorBelt();
        belt.start();
        belt.stop();
        belt.speed();
        belt.materialType();

        System.out.println("----");

        IndustrialConveyorBelt industrial = new IndustrialConveyorBelt();
        industrial.start();
        industrial.loadCapacity();
        industrial.materialType();
        industrial.stop();

        System.out.println("----");

        SmartConveyorBelt smart = new SmartConveyorBelt();
        smart.start();
        smart.loadCapacity();
        smart.materialType();

        System.out.println("----");

        smart.manageBelt(new IndustrialConveyorBelt());
    }
}
