package com.xworkz.inheritanceDemo;

public class CuttingBoard extends Saucepan {

    @Override
    public void addIngredients() {
        System.out.println("Ingredients are placed on the cutting board for chopping");
    }

    @Override
    public void heatContents() {
        System.out.println("Cutting board is not used for heating contents");
    }

    @Override
    public void stirContents() {
        System.out.println("Cutting board is not used for stirring contents");
    }

    @Override
    public void pourOut() {
        System.out.println("Cutting board is used to transfer chopped items");
    }

    @Override
    public void washPan() {
        System.out.println("Cutting board is washed after chopping is done");
    }

    public void chopVegetables() {
        System.out.println("Vegetables are chopped on the cutting board");
    }

    public void sliceFruits() {
        System.out.println("Fruits are sliced on the cutting board");
    }

    public void diceIngredients() {
        System.out.println("Ingredients are diced finely on the board");
    }

    public void sanitizeBoard() {
        System.out.println("Cutting board is sanitized to maintain hygiene");
    }
}
