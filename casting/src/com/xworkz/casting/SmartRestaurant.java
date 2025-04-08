package com.xworkz.casting;

public class SmartRestaurant extends BurgerJoint {

    @Override
    public void menu() {
        System.out.println("SmartRestaurant Menu: Includes vegan and AI-customized meals");
    }

    public void manageRestaurant(FastFoodRestaurant restaurant) {
        System.out.println("Managing fast food restaurant...");

        restaurant.menu();
        restaurant.serviceType();

        if (restaurant instanceof BurgerJoint) {
            System.out.println("It's a BurgerJoint.");
            BurgerJoint joint = (BurgerJoint) restaurant;
            joint.offerComboDeals();
            joint.location();
        }
    }
}
