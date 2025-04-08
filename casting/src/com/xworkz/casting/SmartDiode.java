package com.xworkz.casting;

public class SmartDiode extends LightEmittingDiode {

    @Override
    public void flowDirection() {
        System.out.println("Smart diode auto-regulates current flow.");
    }

    public void manageDiode(Diode diode) {
        System.out.println("Managing diode...");

        diode.flowDirection();
        diode.application();

        if (diode instanceof LightEmittingDiode) {
            System.out.println("It's an LED.");
            LightEmittingDiode led = (LightEmittingDiode) diode;
            led.color();
            led.type();
        }
    }
}
