package com.xworkz.inheritanceDemo;

public class IronMan extends Superhero {

    public IronMan() {
        super();
        System.out.println("IronMan suit is activated");
    }

    @Override
    public void fly() {
        System.out.println("IronMan is flying using suit boosters");
    }

    @Override
    public void fightVillains() {
        System.out.println("IronMan is using advanced tech to fight villains");
    }

    @Override
    public void useSuperStrength() {
        System.out.println("IronMan uses suit's power for super strength");
    }

    @Override
    public void savePeople() {
        System.out.println("IronMan is rescuing people with precision");
    }

    @Override
    public void disguiseIdentity() {
        System.out.println("IronMan's identity is known but still strategic");
    }

    public void activateSuit() {
        System.out.println("IronMan activates his suit");
    }

    public void launchMissiles() {
        System.out.println("IronMan launches missiles at enemies");
    }

    public void useArcReactor() {
        System.out.println("IronMan uses the arc reactor for energy");
    }

    public void scanForThreats() {
        System.out.println("IronMan scans for threats using AI");
    }

    public void buildNewTechnology() {
        System.out.println("IronMan builds new technology in his lab");
    }
}
