package com.xworkz.inheritanceDemo;

public class VideoGame extends Game {

    public VideoGame() {
        super();
        System.out.println("VideoGame class constructor");
    }

    @Override
    public void start() {
        System.out.println("VideoGame is starting with cinematic intro...");
    }

    @Override
    public void stop() {
        System.out.println("VideoGame is saving progress and stopping...");
    }

    @Override
    public void scorePoints() {
        System.out.println("Player scored points in the video game!");
    }

    @Override
    public void setDifficulty() {
        System.out.println("VideoGame difficulty set to HARD mode");
    }

    @Override
    public void reset() {
        System.out.println("VideoGame has been reset to default settings");
    }


    public void loadGraphics() {
        System.out.println("Loading high-definition graphics...");
    }

    public void multiplayerMode() {
        System.out.println("Enabling multiplayer mode...");
    }

    public void saveProgress() {
        System.out.println("Saving game progress...");
    }

    public void unlockLevels() {
        System.out.println("Unlocking secret levels...");
    }

    public void playWithController() {
        System.out.println("Playing with a game controller");
    }
}
