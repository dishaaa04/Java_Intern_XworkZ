package com.xworkz.casting;

public class VideoGame extends Game {

    @Override
    public void name() {
        System.out.println("Game: Call of Duty");
    }

    @Override
    public void type() {
        System.out.println("Type: First-person shooter");
    }

    public void platform() {
        System.out.println("Platform: PC, Xbox, PlayStation");
    }

    @Override
    public void duration() {
        System.out.println("Duration: Depends on game mode");
    }
}
