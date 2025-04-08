package com.xworkz.casting;

public class CitrusFruit extends Fruit {

    @Override
    public void name() {
        System.out.println("Fruit: Orange");
    }

    @Override
    public void taste() {
        System.out.println("Taste: Tangy and sweet");
    }

    public void vitaminCContent() {
        System.out.println("High in Vitamin C");
    }

    @Override
    public void season() {
        System.out.println("Season: Winter");
    }
}
