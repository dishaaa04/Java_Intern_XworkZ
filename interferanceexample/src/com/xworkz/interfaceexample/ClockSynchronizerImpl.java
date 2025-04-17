package com.xworkz.interfaceexample;

public class ClockSynchronizerImpl implements ClockSynchronizer {

    String currentTime = "00:00";

    @Override
    public void syncTime() {
        currentTime = "12:00";
        System.out.println("Time synchronized to: " + currentTime);
    }

    @Override
    public void showCurrentTime() {
        System.out.println("Current time: " + currentTime);
    }

    @Override
    public void resetClock() {
        currentTime = "00:00";
        System.out.println("Clock reset to: " + currentTime);
    }
}
