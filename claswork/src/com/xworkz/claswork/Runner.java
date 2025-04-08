package com.xworkz.claswork;

public class Runner {
    public static void main(String[] args) {
        Rubber rubber = new Tyre();
        rubber.elasticity();
        //rubber.compress();

        Tyre tyre = new Tyre();
        tyre.grip();
        tyre.elasticity();
        tyre.compress();

        Rubber rubber1 = new Rubber();
        rubber1.elasticity();

        MRFTyre mrfTyre = new MRFTyre();
        ArmyVehicle armyVehicle = new ArmyVehicle();
        armyVehicle.vehicle(rubber);
        armyVehicle.vehicle(tyre);
        armyVehicle.vehicle(rubber1);
        armyVehicle.vehicle(mrfTyre);


    }
}