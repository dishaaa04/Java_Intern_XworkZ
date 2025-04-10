package com.xworkz.stringrepresntation;

public class Zoo {
    private String name;
    private int animalsCount;
    private boolean isOpen;

    public Zoo(String name, int animalsCount, boolean isOpen) {
        this.name = name;
        this.animalsCount = animalsCount;
        this.isOpen = isOpen;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", animalsCount=" + animalsCount + ", isOpen=" + isOpen + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 9200;
    }
}
