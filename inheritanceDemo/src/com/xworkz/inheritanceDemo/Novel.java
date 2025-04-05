package com.xworkz.inheritanceDemo;

public class Novel extends Book {

    Novel() {
        super();
        System.out.println("Novel class");
    }

    @Override
    public void read() {
        System.out.println("Reading an engaging novel");
    }

    @Override
    public void open() {
        System.out.println("Opening the first chapter of the novel");
    }

    @Override
    public void close() {
        System.out.println("Closing the novel after reading");
    }

    @Override
    public void bookmark() {
        System.out.println("Bookmarking an exciting part of the novel");
    }

    @Override
    public void turnPage() {
        System.out.println("Turning the page to continue the novel");
    }

    public void genre() {
        System.out.println("Novel has different genres");
    }

    public void author() {
        System.out.println("Novel has an author");
    }

    public void storyline() {
        System.out.println("Novel has a storyline");
    }

    public void characters() {
        System.out.println("Novel has many characters");
    }

    public void chapters() {
        System.out.println("Novel is divided into chapters");
    }
}
