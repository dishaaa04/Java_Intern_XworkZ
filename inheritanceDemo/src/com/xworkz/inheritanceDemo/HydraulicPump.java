package com.xworkz.inheritanceDemo;

public class HydraulicPump extends Gearbox {

    public void generatePressure() {
        System.out.println("HydraulicPump generates hydraulic pressure");
    }

    public void circulateFluid() {
        System.out.println("HydraulicPump circulates fluid");
    }

    public void controlFlow() {
        System.out.println("HydraulicPump controls the flow of fluid");
    }

    public void liftLoad() {
        System.out.println("HydraulicPump lifts the load");
    }

    public void operateActuator() {
        System.out.println("HydraulicPump operates hydraulic actuator");
    }
}
