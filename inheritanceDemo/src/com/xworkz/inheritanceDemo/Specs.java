package com.xworkz.inheritanceDemo;

public class Specs extends Glass {

    public Specs() {
        super();
        System.out.println("Specs object is created");
    }

    public void antiGlare() {
        System.out.println("Specs have anti-glare coating");
    }

    public void frameMaterial() {
        System.out.println("Specs frame is made of plastic or metal");
    }

    public void lensType() {
        System.out.println("Specs have different lens types");
    }

    public void stylish() {
        System.out.println("Specs are designed to look stylish");
    }

    public void uvProtection() {
        System.out.println("Specs provide UV protection");
    }
}
