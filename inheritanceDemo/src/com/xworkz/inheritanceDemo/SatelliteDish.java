package com.xworkz.inheritanceDemo;

public class SatelliteDish {

    public SatelliteDish() {
        System.out.println("SatelliteDish is initialized");
    }

    public void receiveSignal() {
        System.out.println("SatelliteDish receives satellite signals");
    }

    public void transmitSignal() {
        System.out.println("SatelliteDish transmits signals to the satellite");
    }

    public void adjustAngle() {
        System.out.println("SatelliteDish adjusts its angle for better signal");
    }

    public void detectChannel() {
        System.out.println("SatelliteDish detects available channels");
    }

    public void provideConnection() {
        System.out.println("SatelliteDish provides signal to the receiver");
    }
}
