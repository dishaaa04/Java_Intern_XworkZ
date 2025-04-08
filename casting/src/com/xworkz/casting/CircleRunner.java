package com.xworkz.casting;

public class CircleRunner {

    public static void main(String[] args) {

        Circle circle = new ColoredCircle();
        circle.draw();
        circle.area();
        circle.color();
        circle.borderWidth();

        System.out.println("----");

        ColoredCircle colored = new ColoredCircle();
        colored.draw();
        colored.fillColor();
        colored.color();
        colored.area();

        System.out.println("----");

        SmartColoredCircle smart = new SmartColoredCircle();
        smart.draw();
        smart.fillColor();
        smart.color();

        System.out.println("----");

        smart.manageCircle(new ColoredCircle());
    }
}
