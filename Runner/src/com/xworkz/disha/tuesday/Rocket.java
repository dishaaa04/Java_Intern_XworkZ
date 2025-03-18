package com.xworkz.disha.tuesday;

class Rocket {
    void launch(Fuel fuel) {
        if (fuel != null) {
            System.out.println("Ignition sequence started...");
            fuel.burn();
            System.out.println("Rocket is launching!");
        } else {
            System.out.println("No fuel! Rocket can't launch.");
        }
    }
}

