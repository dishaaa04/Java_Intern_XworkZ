package com.xworkz.inheritanceDemo;

public class Items extends Stationery {

    public Items() {
        super();
        System.out.println("Items include all kinds of stationery");
    }

    @Override
    public void write() {
        System.out.println("Items like pens and pencils are used to write");
    }

    @Override
    public void draw() {
        System.out.println("Items like markers and crayons help in drawing");
    }

    @Override
    public void store() {
        System.out.println("Items are stored in shelves or organizers");
    }

    @Override
    public void organize() {
        System.out.println("Items are arranged according to their usage");
    }

    @Override
    public void use() {
        System.out.println("Items are frequently used in schools and offices");
    }

    public void listItems() {
        System.out.println("Listing all available stationery items");
    }

    public void sharpen() {
        System.out.println("Sharpening pencils with sharpeners");
    }

    public void erase() {
        System.out.println("Erasing mistakes with erasers");
    }

    public void measure() {
        System.out.println("Measuring using scale or ruler");
    }

    public void staple() {
        System.out.println("Stapling papers together");
    }
}
