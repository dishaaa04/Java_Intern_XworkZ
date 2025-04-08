package com.xworkz.casting;

public class ElectricityRunner {

    public static void main(String[] args) {

        Electricity electricity = new PowerGrid();
        electricity.generate();
        electricity.distribute();
        electricity.source();
        electricity.voltageLevel();

        System.out.println("----");

        PowerGrid grid = new PowerGrid();
        grid.generate();
        grid.manageLoad();
        grid.source();
        grid.distribute();

        System.out.println("----");

        SmartGrid smart = new SmartGrid();
        smart.generate();
        smart.manageLoad();
        smart.source();

        System.out.println("----");

        smart.manageGrid(new PowerGrid());
    }
}
