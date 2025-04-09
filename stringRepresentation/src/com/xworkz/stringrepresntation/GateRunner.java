package com.xworkz.stringrepresntation;

public class GateRunner {
    public static void main(String[] args) {
        Gate gate = new Gate("Iron", 7.5, false);
        System.out.println("gate" + gate.toString());
    }
}
