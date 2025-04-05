package com.xworkz.inheritanceDemo;

public class Comb extends MirrorStand {

    @Override
    public void holdMirror() {
        System.out.println("Comb does not hold a mirror");
    }

    @Override
    public void rotateMirror() {
        System.out.println("Comb has no rotating parts");
    }

    @Override
    public void adjustHeight() {
        System.out.println("Comb height cannot be adjusted");
    }

    @Override
    public void supportStability() {
        System.out.println("Comb does not need to support anything else");
    }

    @Override
    public void enhanceVanitySetup() {
        System.out.println("Comb is part of the vanity but doesn’t enhance setup by itself");
    }

    public void detangleHair() {
        System.out.println("Comb detangles and smooths out hair");
    }

    public void styleHair() {
        System.out.println("Comb is used for styling and arranging hair");
    }

    public void cleanHair() {
        System.out.println("Comb helps in removing loose hair strands");
    }

    public void maintainScalp() {
        System.out.println("Comb maintains scalp health by stimulating it");
    }
}
