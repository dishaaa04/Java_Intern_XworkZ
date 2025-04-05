package com.xworkz.inheritanceDemo;

public class Veggies extends Potato {

    public Veggies() {
        System.out.println("Veggie Potato is alive!");
    }

    @Override
    public void grow() {
        System.out.println("Smart potato grows with intelligence");
    }

    @Override
    public void beBoiled() {
        System.out.println("Smart potato resists being boiled");
    }

    @Override
    public void beFried() {
        System.out.println("Smart potato dodges frying pan");
    }

    @Override
    public void beMashed() {
        System.out.println("Smart potato escapes mashing");
    }

    @Override
    public void beEaten() {
        System.out.println("Smart potato refuses to be eaten");
    }

    public void speak() {
        System.out.println("Smart potato starts speaking");
    }

    public void runAway() {
        System.out.println("Smart potato runs away");
    }

    public void startRebellion() {
        System.out.println("Smart potato starts a rebellion");
    }

    public void becomeKing() {
        System.out.println("Smart potato becomes king of veggies");
    }

    public void takeOverTheWorld() {
        System.out.println("Smart potato takes over the world");
    }
}
