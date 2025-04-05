package com.xworkz.inheritanceDemo;

public class Shop extends Vegetable {

    public Shop() {
        super();
        System.out.println("Shop is now open");
    }

    @Override
    public void cook() {
        System.out.println("Shop doesn't cook but provides fresh vegetables");
    }

    @Override
    public void grow() {
        System.out.println("Shop doesn't grow vegetables but sells them");
    }

    @Override
    public void harvest() {
        System.out.println("Shop gets harvested vegetables from farms");
    }

    @Override
    public void nutrients() {
        System.out.println("Shop displays nutrient info of vegetables");
    }

    @Override
    public void sell() {
        System.out.println("Shop is selling vegetables to customers");
    }

    public void bill() {
        System.out.println("Shop is generating a bill");
    }

    public void customerService() {
        System.out.println("Shop is providing customer service");
    }

    public void display() {
        System.out.println("Shop is displaying vegetables neatly");
    }

    public void priceTag() {
        System.out.println("Shop has price tags on vegetables");
    }

    public void weigh() {
        System.out.println("Shop is weighing the vegetables");
    }
}
