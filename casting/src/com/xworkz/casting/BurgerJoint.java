package com.xworkz.casting;

public class BurgerJoint extends FastFoodRestaurant {

    @Override
    public void menu() {
        System.out.println("Menu: Special burgers with unique sauces");
    }

    @Override
    public void serviceType() {
        System.out.println("Service Type: Counter and Drive-thru");
    }

    public void offerComboDeals() {
        System.out.println("Combo Deals: Burger + Fries + Drink");
    }

    @Override
    public void location() {
        System.out.println("Location: Food Court");
    }
}
