package com.xworkz.casting;

public class GameRunner {

    public static void main(String[] args) {

        Game game = new VideoGame();
        game.name();
        game.type();
        game.players();
        game.duration();

        System.out.println("----");

        VideoGame vg = new VideoGame();
        vg.name();
        vg.platform();
        vg.type();
        vg.duration();

        System.out.println("----");

        SmartGame smart = new SmartGame();
        smart.name();
        smart.platform();
        smart.duration();

        System.out.println("----");

        smart.manageGame(new VideoGame());
    }
}
