package com.xworkz.casting;

public class SmartGame extends VideoGame {

    @Override
    public void name() {
        System.out.println("Game: AI-enhanced Multiplayer Game");
    }

    public void manageGame(Game game) {
        System.out.println("Managing game session...");

        game.name();
        game.type();

        if (game instanceof VideoGame) {
            System.out.println("It's a VideoGame.");
            VideoGame vg = (VideoGame) game;
            vg.platform();
            vg.duration();
        }
    }
}
