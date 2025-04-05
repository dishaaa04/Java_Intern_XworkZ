package com.xworkz.inheritanceDemo;

public class Fan extends Mirror {

    @Override
    public void reflectImage() {
        System.out.println("Fan circulates air, does not reflect images");
    }

    @Override
    public void mountOnWall() {
        System.out.println("Fan can be mounted on the wall or ceiling");
    }

    @Override
    public void cleanSurface() {
        System.out.println("Cleaning the fan blades and cover");
    }

    @Override
    public void adjustAngle() {
        System.out.println("Adjusting the tilt angle of the fan");
    }

    @Override
    public void decorateRoom() {
        System.out.println("Fan can also add to room aesthetics with design and lights");
    }

    public void switchOn() {
        System.out.println("Turning the fan on");
    }

    public void adjustSpeed() {
        System.out.println("Adjusting the fan speed");
    }

    public void rotateBlades() {
        System.out.println("Fan blades rotate to circulate air");
    }

    public void switchOff() {
        System.out.println("Turning the fan off");
    }
}
