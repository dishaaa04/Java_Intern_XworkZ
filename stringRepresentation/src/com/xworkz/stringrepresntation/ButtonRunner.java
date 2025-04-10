package com.xworkz.stringrepresntation;

public class ButtonRunner {
    public static void main(String[] args) {
        Button button = new Button("Round", "Black", true);
        System.out.println("button = " + button.toString());

        int code = button.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("click = " + "click".hashCode());
        System.out.println("press = " + "press".hashCode());
        System.out.println("toggle = " + "toggle".hashCode());
    }
}
