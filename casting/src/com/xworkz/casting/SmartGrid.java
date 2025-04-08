package com.xworkz.casting;

public class SmartGrid extends PowerGrid {

    @Override
    public void generate() {
        System.out.println("SmartGrid uses real-time data for efficient generation.");
    }

    public void manageGrid(Electricity electricity) {
        System.out.println("Managing electricity system...");

        electricity.generate();
        electricity.source();

        if (electricity instanceof PowerGrid) {
            System.out.println("It's a PowerGrid.");
            PowerGrid grid = (PowerGrid) electricity;
            grid.manageLoad();
            grid.voltageLevel();
        }
    }
}
