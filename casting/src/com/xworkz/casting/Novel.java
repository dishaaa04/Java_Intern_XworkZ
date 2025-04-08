package com.xworkz.casting;

public class Novel extends Book {

    @Override
    public void open() {
        System.out.println("Opening a fictional novel.");
    }

    @Override
    public void close() {
        System.out.println("Closing the novel after an exciting chapter.");
    }

    public void describePlot() {
        System.out.println("The novel has a thrilling storyline.");
    }

    @Override
    public void genre() {
        System.out.println("Genre: Fiction/Novel.");
    }
}

