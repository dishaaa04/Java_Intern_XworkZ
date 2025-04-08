package com.xworkz.casting;

public class HydraulicActuator extends Actuator {

    @Override
    public void activate() {
        System.out.println("Hydraulic actuator activated.");
    }

    @Override
    public void powerSource() {
        System.out.println("Hydraulic fluid as power source.");
    }

    public void controlPressure() {
        System.out.println("Controlling hydraulic pressure.");
    }
}
