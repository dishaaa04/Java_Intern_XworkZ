package com.xworkz.interfaceexample;

public class ClockSynchronizerRunner {
    public static void main(String[] args) {
        ClockSynchronizer clock = new ClockSynchronizerImpl();
        clock.showCurrentTime();
        clock.syncTime();
        clock.showCurrentTime();
        clock.resetClock();
        clock.showCurrentTime();
    }
}
