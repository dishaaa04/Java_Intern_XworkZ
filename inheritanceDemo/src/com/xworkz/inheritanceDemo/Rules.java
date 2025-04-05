package com.xworkz.inheritanceDemo;

public class Rules extends Traffic {

    public Rules() {
        super();
        System.out.println("Traffic rules enforcement started");
    }

    @Override
    public void red() {
        System.out.println("Breaking red signal leads to fine");
    }

    @Override
    public void green() {
        System.out.println("Green means safe to go");
    }

    @Override
    public void yellow() {
        System.out.println("Yellow indicates to prepare to stop");
    }

    @Override
    public void signals() {
        System.out.println("Signals control vehicle movement");
    }

    @Override
    public void zebra() {
        System.out.println("Zebra crossing is for pedestrians");
    }

    public void fine() {
        System.out.println("Fine is charged for rule violations");
    }

    public void follow() {
        System.out.println("Everyone must follow the traffic rules");
    }

    public void police() {
        System.out.println("Traffic police ensure safety");
    }

    public void right() {
        System.out.println("Always drive on the correct side");
    }

    public void wrong() {
        System.out.println("Wrong turns are dangerous");
    }
}
