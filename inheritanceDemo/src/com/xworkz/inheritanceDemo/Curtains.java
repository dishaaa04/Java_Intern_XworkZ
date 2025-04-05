package com.xworkz.inheritanceDemo;

public class Curtains extends Pillows {

    @Override
    public void provideSupport() {
        System.out.println("Curtains provide privacy, not physical support");
    }

    @Override
    public void adjustShape() {
        System.out.println("Curtains are adjusted by pulling them open or closed");
    }

    @Override
    public void changeCovers() {
        System.out.println("Curtains are washed, not covered");
    }

    @Override
    public void fluff() {
        System.out.println("Curtains do not need fluffing");
    }

    @Override
    public void placeOnBed() {
        System.out.println("Curtains are hung on windows, not placed on beds");
    }

    public void blockLight() {
        System.out.println("Curtains block or filter light entering the room");
    }

    public void enhanceDecor() {
        System.out.println("Curtains add to the interior decor of the room");
    }

    public void slideOpen() {
        System.out.println("Curtains slide open to let in light");
    }

    public void slideClose() {
        System.out.println("Curtains slide closed for privacy");
    }
}
