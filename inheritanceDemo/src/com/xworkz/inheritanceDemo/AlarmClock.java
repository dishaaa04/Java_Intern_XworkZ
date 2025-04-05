package com.xworkz.inheritanceDemo;

public class AlarmClock extends VacuumCleaner {

    @Override
    public void powerOn() {
        System.out.println("Alarm clock is turned on to set alarms");
    }

    @Override
    public void startCleaning() {
        System.out.println("Alarm clock doesn't clean but rings at set time");
    }

    @Override
    public void adjustSuctionPower() {
        System.out.println("Alarm clock adjusts volume, not suction");
    }

    @Override
    public void emptyDustBin() {
        System.out.println("Alarm clock doesn't have a dust bin to empty");
    }

    @Override
    public void powerOff() {
        System.out.println("Alarm clock is turned off");
    }

    public void setAlarm() {
        System.out.println("Setting an alarm for a specific time");
    }

    public void ringAlarm() {
        System.out.println("Alarm clock rings to wake up the user");
    }

    public void snoozeAlarm() {
        System.out.println("Snoozing the alarm for a few more minutes");
    }

    public void displayTime() {
        System.out.println("Displaying the current time on the clock");
    }
}

