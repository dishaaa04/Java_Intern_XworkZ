package com.xworkz.casting;

public class ColoredCircle extends Circle {

    @Override
    public void draw() {
        System.out.println("Drawing a colored circle.");
    }

    @Override
    public void area() {
        System.out.println("Colored Circle area: π * r^2");
    }

    public void fillColor() {
        System.out.println("Filling the circle with blue color.");
    }

    @Override
    public void color() {
        System.out.println("Color: Blue");
    }
}
