package com.xworkz.inheritanceDemo;

public class Circle extends Shape {

    public Circle() {
        super();
        System.out.println("Circle is being created");
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    public void area() {
        System.out.println("Calculating area of circle");
    }

    @Override
    public void perimeter() {
        System.out.println("Calculating perimeter of circle");
    }

    @Override
    public void resize() {
        System.out.println("Resizing circle");
    }

    @Override
    public void displayColor() {
        System.out.println("Displaying circle color");
    }

    public void calculateDiameter() {
        System.out.println("Calculating diameter of circle");
    }

    public void calculateCircumference() {
        System.out.println("Calculating circumference of circle");
    }

    public void drawSmoothEdges() {
        System.out.println("Drawing smooth edges of circle");
    }

    public void rotate() {
        System.out.println("Rotating the circle");
    }

    public void fillColor() {
        System.out.println("Filling color in the circle");
    }
}
