package com.xworkz.inheritanceDemo;

public class IceCream extends Dessert {

    IceCream() {
        super();
        System.out.println("Ice Cream is a frozen dessert");
    }

    @Override
    public void taste() {
        System.out.println("Ice Cream tastes creamy and cold");
    }

    @Override
    public void ingredients() {
        System.out.println("Ice Cream is made with milk, cream, and sugar");
    }

    @Override
    public void serve() {
        System.out.println("Ice Cream is served with toppings or in cones");
    }

    @Override
    public void store() {
        System.out.println("Ice Cream should be stored in a freezer");
    }

    @Override
    public void enjoy() {
        System.out.println("Kids and adults love eating ice cream");
    }

    public void flavor() {
        System.out.println("Ice Cream comes in many flavors");
    }

    public void temperature() {
        System.out.println("Ice Cream is served cold");
    }

    public void topping() {
        System.out.println("Ice Cream can have various toppings");
    }

    public void scoop() {
        System.out.println("Ice Cream is often served in scoops");
    }

    public void coneOrCup() {
        System.out.println("Ice Cream can be served in a cone or a cup");
    }
}
