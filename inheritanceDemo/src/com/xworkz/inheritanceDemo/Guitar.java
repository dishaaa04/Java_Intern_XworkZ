package com.xworkz.inheritanceDemo;

public class Guitar extends Music {

    public Guitar() {
        super();
        System.out.println("Guitar is ready to play");
    }

    @Override
    public void play() {
        System.out.println("Guitar is playing melodies");
    }

    @Override
    public void stop() {
        System.out.println("Guitar music is stopped");
    }

    @Override
    public void pause() {
        System.out.println("Guitar playing is paused");
    }

    @Override
    public void volume() {
        System.out.println("Guitar volume is adjusted");
    }

    @Override
    public void instrument() {
        System.out.println("Guitar is a string instrument");
    }

    public void chord() {
        System.out.println("Guitar plays a chord");
    }

    public void sound() {
        System.out.println("Guitar produces a rich sound");
    }

    public void pluck() {
        System.out.println("Plucking the guitar strings");
    }

    public void strum() {
        System.out.println("Strumming the guitar");
    }

    public void strings() {
        System.out.println("Guitar has six strings");
    }
}
