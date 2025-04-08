package com.xworkz.casting;

public class DiodeRunner {

    public static void main(String[] args) {

        Diode diode = new LightEmittingDiode();
        diode.flowDirection();
        diode.type();
        diode.voltageDrop();
        diode.application();

        System.out.println("----");

        LightEmittingDiode led = new LightEmittingDiode();
        led.flowDirection();
        led.color();
        led.type();
        led.application();

        System.out.println("----");

        SmartDiode smart = new SmartDiode();
        smart.flowDirection();
        smart.color();
        smart.type();

        System.out.println("----");

        smart.manageDiode(new LightEmittingDiode());
    }
}
