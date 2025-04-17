package com.xworkz.interfaceexample;

public class AudioMixerRunner {
    public static void main(String[] args) {
        AudioMixer mixer = new AudioMixerImpl();
        mixer.mixTracks();
        mixer.adjustVolume();
        mixer.applyEffects();
    }
}
