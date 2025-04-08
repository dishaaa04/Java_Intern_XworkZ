package com.xworkz.casting;

public class IndustrialConveyorBelt extends ConveyorBelt {

    @Override
    public void start() {
        System.out.println("Industrial conveyor belt activated.");
    }

    @Override
    public void stop() {
        System.out.println("Industrial conveyor belt halted.");
    }

    public void loadCapacity() {
        System.out.println("Load capacity: 500kg.");
    }

    @Override
    public void materialType() {
        System.out.println("Material type: Reinforced steel mesh.");
    }
}
