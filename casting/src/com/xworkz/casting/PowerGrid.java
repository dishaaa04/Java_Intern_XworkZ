package com.xworkz.casting;

public class PowerGrid extends Electricity {

    @Override
    public void generate() {
        System.out.println("PowerGrid generates electricity from multiple sources.");
    }

    @Override
    public void distribute() {
        System.out.println("PowerGrid distributes electricity across regions.");
    }

    public void manageLoad() {
        System.out.println("Managing load across cities.");
    }

    @Override
    public void source() {
        System.out.println("Source: Solar and Thermal");
    }
}
