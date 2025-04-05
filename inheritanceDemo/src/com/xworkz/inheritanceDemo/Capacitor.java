package com.xworkz.inheritanceDemo;

public class Capacitor extends Resistor {

    public Capacitor() {
        super();
        System.out.println("Capacitor is initialized");
    }

    @Override
    public void resistCurrent() {
        System.out.println("Capacitor does not resist DC after charging");
    }

    @Override
    public void generateHeat() {
        System.out.println("Capacitor doesn't generate much heat");
    }

    @Override
    public void reduceVoltage() {
        System.out.println("Capacitor blocks DC and passes AC");
    }

    @Override
    public void limitCurrent() {
        System.out.println("Capacitor limits current temporarily during charging");
    }

    @Override
    public void ohmsLaw() {
        System.out.println("Capacitor works with capacitive reactance");
    }

    public void storeCharge() {
        System.out.println("Capacitor stores electric charge");
    }

    public void releaseCharge() {
        System.out.println("Capacitor releases stored charge");
    }

    public void blockDC() {
        System.out.println("Capacitor blocks direct current");
    }

    public void passAC() {
        System.out.println("Capacitor allows alternating current to pass");
    }

    public void smoothVoltage() {
        System.out.println("Capacitor smooths voltage in power supplies");
    }
}
