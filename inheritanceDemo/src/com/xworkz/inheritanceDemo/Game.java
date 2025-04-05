package com.xworkz.inheritanceDemo;

public class Game {

    public Game() {
        System.out.println("Game class constructor");
    }

    public void start() {
        System.out.println("Game is starting...");
    }

    public void stop() {
        System.out.println("Game is stopping...");
    }

    public void scorePoints() {
        System.out.println("Scoring points in the game...");
    }

    public void setDifficulty() {
        System.out.println("Setting game difficulty...");
    }

    public void reset() {
        System.out.println("Resetting the game...");
    }
}
