package com.xworkz.inheritanceDemo;

public class Joy extends Festival {
    Joy() {
        super();
        System.out.println("Joy class");
    }

    @Override
    public void clothes() {
        System.out.println("Joy comes from wearing colorful clothes");
    }

    @Override
    public void food() {
        System.out.println("Joyful moments with festive food");
    }

    @Override
    public void happy() {
        System.out.println("Joy fills everyone with happiness");
    }

    @Override
    public void share() {
        System.out.println("Joy increases when we share with others");
    }

    @Override
    public void sweets() {
        System.out.println("Joy is in the sweetness of festival treats");
    }

    public void children() {
        System.out.println("Children enjoy the festival with excitement");
    }

    public void decorate() {
        System.out.println("Decorating the house brings joy");
    }

    public void enjoy() {
        System.out.println("Everyone enjoys the festive vibes");
    }

    public void games() {
        System.out.println("Playing games adds fun to the festival");
    }

    public void smile() {
        System.out.println("Smiles everywhere during festival time");
    }
}
