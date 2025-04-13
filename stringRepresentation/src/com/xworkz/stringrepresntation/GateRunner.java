package com.xworkz.stringrepresntation;

public class GateRunner {
    public static void main(String[] args) {

        Gate gate1 = new Gate();
        gate1.setMaterial("Iron");
        gate1.setType("Sliding");

        Gate gate2 = new Gate();
        gate2.setMaterial("Iron");
        gate2.setType("Sliding");

        System.out.println("Checking same location: " + (gate1 == gate2));
        boolean same = gate1.equals(gate2);
        System.out.println("gate1 is same as gate2: " + same);
    }
}
