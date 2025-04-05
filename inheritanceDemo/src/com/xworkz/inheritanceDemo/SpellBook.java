package com.xworkz.inheritanceDemo;

public class SpellBook extends Magic {

    public SpellBook() {
        super();
        System.out.println("SpellBook is opened");
    }

    @Override
    public void castSpell() {
        System.out.println("SpellBook casts a powerful spell");
    }

    @Override
    public void createIllusion() {
        System.out.println("SpellBook creates a realistic illusion");
    }

    @Override
    public void summonCreature() {
        System.out.println("SpellBook summons a mythical creature");
    }

    @Override
    public void controlElements() {
        System.out.println("SpellBook controls fire, water, earth, and air");
    }

    @Override
    public void disappear() {
        System.out.println("SpellBook disappears into thin air");
    }

    public void readSpell() {
        System.out.println("Reading an ancient spell");
    }

    public void storeMagic() {
        System.out.println("Storing magical energy");
    }

    public void unlockSecret() {
        System.out.println("Unlocking a hidden secret");
    }

    public void createPotion() {
        System.out.println("Creating a powerful potion");
    }

    public void enhancePower() {
        System.out.println("Enhancing magical power");
    }
}
