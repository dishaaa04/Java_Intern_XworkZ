package com.xworkz.casting;

public class ActuatorRunner {

    public static void main(String[] args) {
        Actuator actuator = new HydraulicActuator();
        actuator.activate();
        actuator.deactivate();
        actuator.type();
        actuator.powerSource();

        System.out.println("----");

        HydraulicActuator hydraulic = new HydraulicActuator();
        hydraulic.activate();
        hydraulic.controlPressure();
        hydraulic.powerSource();
        hydraulic.type();

        System.out.println("----");

        SmartHydraulicActuator smart = new SmartHydraulicActuator();
        smart.activate();
        smart.controlPressure();
        smart.powerSource();
        smart.type();

        System.out.println("----");

        smart.manageActuator(new HydraulicActuator());
    }
}
