package com.xworkz.casting;

public class FastFoodRestaurantRunner {

    public static void main(String[] args) {

        FastFoodRestaurant restaurant = new BurgerJoint();
        restaurant.menu();
        restaurant.serviceType();
        restaurant.location();
        restaurant.openHours();

        System.out.println("----");

        BurgerJoint joint = new BurgerJoint();
        joint.menu();
        joint.offerComboDeals();
        joint.serviceType();
        joint.location();

        System.out.println("----");

        SmartRestaurant smart = new SmartRestaurant();
        smart.menu();
        smart.offerComboDeals();
        smart.location();

        System.out.println("----");

        smart.manageRestaurant(new BurgerJoint());
    }
}
