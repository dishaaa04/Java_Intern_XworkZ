package com.xworkz.inheritanceDemo;

public class Jam extends Bread {

    @Override
    public void slice() {
        System.out.println("Jam is not sliced like bread");
    }

    @Override
    public void toast() {
        System.out.println("Jam is not toasted directly");
    }

    @Override
    public void pack() {
        System.out.println("Jam is packed in glass jars");
    }

    @Override
    public void checkFreshness() {
        System.out.println("Checking jam for mold or spoilage");
    }

    @Override
    public void serve() {
        System.out.println("Jam is served with bread");
    }

    public void spread() {
        System.out.println("Jam is spread over bread");
    }

    public void addFlavor() {
        System.out.println("Jam adds fruity flavor");
    }

    public void preserve() {
        System.out.println("Jam is preserved with sugar and sealed");
    }

    public void refrigerate() {
        System.out.println("Jam should be refrigerated after opening");
    }
}

