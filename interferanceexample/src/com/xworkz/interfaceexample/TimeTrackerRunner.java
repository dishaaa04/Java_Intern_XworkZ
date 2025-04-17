package com.xworkz.interfaceexample;

public class TimeTrackerRunner {
    public static void main(String[] args) {
        TimeTracker tracker = new TimeTrackerImpl();
        tracker.startTracking();
        try { Thread.sleep(2000); } catch (InterruptedException e) { e.printStackTrace(); }
        tracker.stopTracking();
        tracker.displayTime();
    }
}
