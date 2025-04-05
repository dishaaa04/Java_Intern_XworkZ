package com.xworkz.inheritanceDemo;

public class Watch extends Time {

    public Watch() {
        super();
        System.out.println("Quantum watch initialized");
    }

    @Override
    public void travelToPast() {
        System.out.println("Watch rewinds to the past");
    }

    @Override
    public void travelToFuture() {
        System.out.println("Watch fast-forwards to the future");
    }

    @Override
    public void createTimeParadox() {
        System.out.println("Watch risks a time paradox");
    }

    @Override
    public void meetHistoricalFigures() {
        System.out.println("Watch shows visions of historical figures");
    }

    @Override
    public void breakLawsOfPhysics() {
        System.out.println("Watch bends the fabric of space-time");
    }

    public void seeTheEndOfTheUniverse() {
        System.out.println("Watch reveals the end of the universe");
    }

    public void glitchInTime() {
        System.out.println("Watch experiences a time glitch");
    }

    public void duplicateYourself() {
        System.out.println("Watch duplicates you in time");
    }

    public void fixBrokenTimeline() {
        System.out.println("Watch attempts to fix the broken timeline");
    }

    public void talkToYourFutureSelf() {
        System.out.println("Watch allows communication with your future self");
    }
}
