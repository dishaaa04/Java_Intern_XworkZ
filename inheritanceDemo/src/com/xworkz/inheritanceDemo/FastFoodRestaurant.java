package com.xworkz.inheritanceDemo;

public class FastFoodRestaurant extends Restaurant {

    public FastFoodRestaurant() {
        System.out.println("Fast Food Restaurant is now open");
    }

    @Override
    public void serveFood() {
        System.out.println("Fast Food Restaurant is quickly serving food");
    }

    @Override
    public void takeOrder() {
        System.out.println("Fast Food Restaurant is taking a quick order");
    }

    @Override
    public void acceptPayment() {
        System.out.println("Fast Food Restaurant accepts digital and cash payments");
    }

    @Override
    public void cleanTables() {
        System.out.println("Fast Food Restaurant is cleaning tables rapidly");
    }

    @Override
    public void provideMenu() {
        System.out.println("Fast Food Restaurant is providing a digital menu");
    }

    public void prepareBurger() {
        System.out.println("Fast Food Restaurant is preparing burgers");
    }

    public void serveSoftDrinks() {
        System.out.println("Fast Food Restaurant is serving soft drinks");
    }

    public void offerTakeaway() {
        System.out.println("Fast Food Restaurant offers takeaway");
    }

    public void provideDriveThru() {
        System.out.println("Fast Food Restaurant has a drive-thru service");
    }

    public void giveDiscounts() {
        System.out.println("Fast Food Restaurant is giving discounts on combos");
    }
}
