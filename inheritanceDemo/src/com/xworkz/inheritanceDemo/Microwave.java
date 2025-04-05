package com.xworkz.inheritanceDemo;

public class Microwave extends Stove {

    @Override
    public void ignite() {
        System.out.println("Microwave starts by generating electromagnetic waves");
    }

    @Override
    public void adjustFlame() {
        System.out.println("Microwave adjusts power level instead of flame");
    }

    @Override
    public void turnOff() {
        System.out.println("Microwave automatically turns off after timer ends");
    }

    @Override
    public void heatUtensil() {
        System.out.println("Microwave heats food inside microwave-safe utensils");
    }

    @Override
    public void cookFood() {
        System.out.println("Microwave cooks food using microwave radiation");
    }

    public void setTimer() {
        System.out.println("Microwave sets timer for heating or cooking");
    }

    public void defrostFood() {
        System.out.println("Microwave defrosts frozen food");
    }

    public void rotateTray() {
        System.out.println("Microwave rotates tray for even heating");
    }

    public void beepOnComplete() {
        System.out.println("Microwave beeps when process is complete");
    }
}
