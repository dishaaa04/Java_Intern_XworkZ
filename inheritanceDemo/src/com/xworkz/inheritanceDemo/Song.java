package com.xworkz.inheritanceDemo;

public class Song extends Art {

    @Override
    public void studyColors() {
        System.out.println("Music studies tones and harmony instead of visual colors");
    }

    @Override
    public void learnDrawing() {
        System.out.println("Music focuses on musical notation rather than sketching");
    }

    @Override
    public void explorePainting() {
        System.out.println("Music explores composition and rhythm instead of painting");
    }

    @Override
    public void understandDesign() {
        System.out.println("Music designs sound arrangements and melodies");
    }

    @Override
    public void analyzeArtHistory() {
        System.out.println("Music analyzes composers, styles, and musical eras");
    }

    public void learnInstruments() {
        System.out.println("Learning to play musical instruments");
    }

    public void practiceSinging() {
        System.out.println("Practicing vocal techniques and pitch control");
    }

    public void studyMusicTheory() {
        System.out.println("Studying scales, chords, and musical notation");
    }

    public void exploreGenres() {
        System.out.println("Exploring different music genres like classical, jazz, and pop");
    }
}
