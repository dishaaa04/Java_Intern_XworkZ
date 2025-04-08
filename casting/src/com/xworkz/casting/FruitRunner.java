package com.xworkz.casting;

public class FruitRunner {

    public static void main(String[] args) {

        Fruit fruit = new CitrusFruit();
        fruit.name();
        fruit.taste();
        fruit.color();
        fruit.season();

        System.out.println("----");

        CitrusFruit citrus = new CitrusFruit();
        citrus.name();
        citrus.vitaminCContent();
        citrus.taste();
        citrus.season();

        System.out.println("----");

        SmartFruit smart = new SmartFruit();
        smart.name();
        smart.vitaminCContent();
        smart.season();

        System.out.println("----");

        smart.manageFruit(new CitrusFruit());
    }
}
