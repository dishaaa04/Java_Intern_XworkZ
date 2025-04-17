package com.xworkz.interfaceexample;

public class TimeTrackerImpl implements TimeTracker {

    long startTime;
    long endTime;

    @Override
    public void startTracking() {
        startTime = System.currentTimeMillis();
        System.out.println("Tracking started.");
    }

    @Override
    public void stopTracking() {
        endTime = System.currentTimeMillis();
        System.out.println("Tracking stopped.");
    }

    @Override
    public void displayTime() {
        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed Time: " + elapsedTime + " milliseconds.");
    }
}
