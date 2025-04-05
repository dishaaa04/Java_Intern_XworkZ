package com.xworkz.inheritanceDemo;

public class Tree extends Plant {

    public Tree() {
        System.out.println("Tree object created");
    }

    @Override
    public void grow() {
        System.out.println("Tree is growing tall");
    }

    @Override
    public void absorbWater() {
        System.out.println("Tree absorbs more water through roots");
    }

    @Override
    public void photosynthesis() {
        System.out.println("Tree performs photosynthesis using leaves");
    }

    @Override
    public void oxygenRelease() {
        System.out.println("Tree releases more oxygen");
    }

    @Override
    public void provideShade() {
        System.out.println("Tree provides large shade");
    }

    public void produceFruits() {
        System.out.println("Tree produces fruits");
    }

    public void strongRoots() {
        System.out.println("Tree has strong roots");
    }

    public void provideWood() {
        System.out.println("Tree provides wood");
    }

    public void habitatForAnimals() {
        System.out.println("Tree provides habitat for animals");
    }

    public void seasonalChanges() {
        System.out.println("Tree undergoes seasonal changes");
    }
}
