package com.xworkz.inheritanceDemo;

public class Spatula extends KnifeSet {

    @Override
    public void selectKnife() {
        System.out.println("Spatula is selected based on cooking need");
    }

    @Override
    public void cutVegetables() {
        System.out.println("Spatula is not used to cut vegetables");
    }

    @Override
    public void sliceMeat() {
        System.out.println("Spatula cannot slice meat; used for flipping");
    }

    @Override
    public void sharpenKnife() {
        System.out.println("Spatula does not require sharpening");
    }

    @Override
    public void cleanKnife() {
        System.out.println("Spatula is cleaned after cooking");
    }

    public void flipFood() {
        System.out.println("Spatula flips food while cooking");
    }

    public void stirIngredients() {
        System.out.println("Spatula stirs ingredients in pan");
    }

    public void serveFood() {
        System.out.println("Spatula is used to serve food from pan");
    }

    public void scrapePan() {
        System.out.println("Spatula scrapes the bottom of pan while cooking");
    }
}
