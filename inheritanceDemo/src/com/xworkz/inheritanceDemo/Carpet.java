package com.xworkz.inheritanceDemo;

public class Carpet extends Chair {

    @Override
    public void provideSeating() {
        System.out.println("Carpet allows sitting on the floor but doesn't provide structured seating");
    }

    @Override
    public void adjustHeight() {
        System.out.println("Carpet has a fixed height (flat on floor)");
    }

    @Override
    public void supportBack() {
        System.out.println("Carpet does not provide back support");
    }

    @Override
    public void movePosition() {
        System.out.println("Carpet can be rolled and repositioned");
    }

    @Override
    public void rotate() {
        System.out.println("Carpet does not rotate like a chair");
    }

    public void enhanceDecor() {
        System.out.println("Carpet enhances the look of the room");
    }

    public void provideWarmth() {
        System.out.println("Carpet provides warmth and comfort on the floor");
    }

    public void reduceNoise() {
        System.out.println("Carpet reduces noise in the room");
    }

    public void cushionFootsteps() {
        System.out.println("Carpet cushions footsteps for a softer walk");
    }
}
