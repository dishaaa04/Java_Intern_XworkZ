package com.xworkz.inheritanceDemo;

public class Transformer extends Inductor {

    public Transformer() {
        super();
        System.out.println("Transformer is initialized");
    }

    @Override
    public void storeEnergy() {
        System.out.println("Transformer transfers energy between circuits");
    }

    @Override
    public void opposeCurrentChange() {
        System.out.println("Transformer regulates voltage levels");
    }

    @Override
    public void generateMagneticField() {
        System.out.println("Transformer uses magnetic field for induction");
    }

    @Override
    public void coilTurns() {
        System.out.println("Transformer has primary and secondary coils");
    }

    @Override
    public void reactToAC() {
        System.out.println("Transformer operates only with AC");
    }

    public void stepUpVoltage() {
        System.out.println("Transformer increases the voltage");
    }

    public void stepDownVoltage() {
        System.out.println("Transformer decreases the voltage");
    }

    public void isolateCircuits() {
        System.out.println("Transformer isolates different circuits");
    }

    public void transferPower() {
        System.out.println("Transformer transfers electrical power");
    }

    public void maintainEfficiency() {
        System.out.println("Transformer works efficiently with minimal loss");
    }
}
