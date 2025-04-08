package com.xworkz.casting;

public class SmartHydraulicActuator extends HydraulicActuator {

    @Override
    public void activate() {
        System.out.println("Smart hydraulic actuator activated.");
    }

    public void manageActuator(Actuator actuator) {
        System.out.println("Managing actuator...");

        if (actuator instanceof HydraulicActuator) {
            System.out.println("This is a hydraulic actuator.");

            HydraulicActuator hydraulic = (HydraulicActuator) actuator;
            hydraulic.controlPressure();
            hydraulic.type();
        }
    }
}
