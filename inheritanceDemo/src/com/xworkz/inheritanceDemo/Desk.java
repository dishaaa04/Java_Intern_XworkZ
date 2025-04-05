package com.xworkz.inheritanceDemo;

public class Desk extends Bookshelf {

    @Override
    public void storeBooks() {
        System.out.println("Desk can store a few books in drawers or shelves");
    }

    @Override
    public void organizeShelves() {
        System.out.println("Desk may have minimal shelving for essentials");
    }

    @Override
    public void supportWeight() {
        System.out.println("Desk supports laptops, books, and writing materials");
    }

    @Override
    public void cleanDust() {
        System.out.println("Desk surface needs regular cleaning for workspace hygiene");
    }

    @Override
    public void displayItems() {
        System.out.println("Desk displays study items like lamps, clocks, and stationery");
    }

    public void writeOnSurface() {
        System.out.println("Using the desk for writing and working");
    }

    public void openDrawers() {
        System.out.println("Opening desk drawers to access supplies");
    }

    public void plugDevices() {
        System.out.println("Plugging in electronic devices at the desk");
    }

    public void useLaptop() {
        System.out.println("Using a laptop on the desk for work or study");
    }
}
