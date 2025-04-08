package com.xworkz.casting;

public class SmartConveyorBelt extends IndustrialConveyorBelt {

    @Override
    public void start() {
        System.out.println("Smart conveyor belt starts with sensor input.");
    }

    public void manageBelt(ConveyorBelt belt) {
        System.out.println("Managing conveyor belt...");

        belt.start();
        belt.speed();

        if (belt instanceof IndustrialConveyorBelt) {
            System.out.println("It's an Industrial Conveyor Belt.");
            IndustrialConveyorBelt industrial = (IndustrialConveyorBelt) belt;
            industrial.loadCapacity();
            industrial.materialType();
        }
    }
}
