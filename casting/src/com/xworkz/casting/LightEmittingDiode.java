package com.xworkz.casting;

public class LightEmittingDiode extends Diode {

    @Override
    public void flowDirection() {
        System.out.println("LED allows current in one direction and emits light.");
    }

    @Override
    public void type() {
        System.out.println("Type: LED");
    }

    public void color() {
        System.out.println("Emits red light.");
    }

    @Override
    public void application() {
        System.out.println("Used in displays and indicators.");
    }
}
