package com.xworkz.casting;

public class SmartColoredCircle extends ColoredCircle {

    @Override
    public void draw() {
        System.out.println("Smart colored circle is being drawn with animation.");
    }

    public void manageCircle(Circle circle) {
        System.out.println("Managing circle...");

        circle.draw();
        circle.area();

        if (circle instanceof ColoredCircle) {
            System.out.println("It's a Colored Circle.");
            ColoredCircle colored = (ColoredCircle) circle;
            colored.fillColor();
            colored.color();
        }
    }
}
