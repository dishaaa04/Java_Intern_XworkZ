package com.xworkz.interfaceexample;

public class AudioMixerImpl implements AudioMixer {

    public void mixTracks() {
        System.out.println("Tracks mixed successfully");
    }

    public void adjustVolume() {
        System.out.println("Volume adjusted");
    }

    public void applyEffects() {
        System.out.println("Audio effects applied");
    }
}
