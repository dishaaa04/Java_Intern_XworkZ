package com.xworkz.stringrepresntation;

public class ButtonRunner {
    public static void main(String[] args) {

        Button button1 = new Button();
        button1.setColor("Red");

        Button button2 = new Button();
        button2.setColor("Red");

        System.out.println("Checking same location: " + (button1 == button2));
        boolean same = button1.equals(button2);
        System.out.println("button1 is same as button2: " + same);
    }
}