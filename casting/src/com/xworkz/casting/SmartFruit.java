package com.xworkz.casting;

public class SmartFruit extends CitrusFruit {

    @Override
    public void name() {
        System.out.println("Fruit: AI-selected fruit for your diet");
    }

    public void manageFruit(Fruit fruit) {
        System.out.println("Analyzing fruit details...");

        fruit.name();
        fruit.taste();

        if (fruit instanceof CitrusFruit) {
            System.out.println("It's a CitrusFruit.");
            CitrusFruit citrus = (CitrusFruit) fruit;
            citrus.vitaminCContent();
            citrus.season();
        }
    }
}
