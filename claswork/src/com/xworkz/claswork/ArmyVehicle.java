package com.xworkz.claswork;

public class ArmyVehicle {
    public void vehicle(Rubber rubber){
        System.out.println("Created a method called vehicle for the ArmyVehicle");
        if (rubber instanceof Tyre) {
            System.out.println("rubber is tyre");

            Tyre tyre = (Tyre) rubber;
            tyre.compress();
        }
        if (rubber instanceof MRFTyre){
            MRFTyre mrfTyre=(MRFTyre) rubber;
            mrfTyre.compress();
        }
    }

}
