package com.xworkz.inheritanceDemo;

public class OpticalFiberCable extends Antenna {

    public OpticalFiberCable() {
        super();
        System.out.println("OpticalFiberCable is initialized");
    }

    @Override
    public void transmitSignal() {
        System.out.println("OpticalFiberCable transmits signals as light pulses");
    }

    @Override
    public void receiveSignal() {
        System.out.println("OpticalFiberCable receives signals via light conversion");
    }

    @Override
    public void range() {
        System.out.println("OpticalFiberCable supports long-distance high-speed data transmission");
    }

    @Override
    public void orientation() {
        System.out.println("OpticalFiberCable does not require directional orientation");
    }

    @Override
    public void frequencyBand() {
        System.out.println("OpticalFiberCable operates in the optical frequency range");
    }

    public void highBandwidth() {
        System.out.println("OpticalFiberCable supports high bandwidth communication");
    }

    public void lowLatency() {
        System.out.println("OpticalFiberCable provides low latency transmission");
    }

    public void immuneToEMI() {
        System.out.println("OpticalFiberCable is immune to electromagnetic interference");
    }

    public void flexible() {
        System.out.println("OpticalFiberCable is physically flexible");
    }

    public void secureTransmission() {
        System.out.println("OpticalFiberCable ensures secure data transmission");
    }
}
