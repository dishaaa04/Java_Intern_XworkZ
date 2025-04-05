package com.xworkz.inheritanceDemo;

public class TableLamp extends WallCalendar {

    @Override
    public void showDate() {
        System.out.println("Table lamp shows the time instead of the date");
    }

    @Override
    public void markHolidays() {
        System.out.println("Table lamp doesn’t mark holidays, but may have a clock");
    }

    @Override
    public void flipPage() {
        System.out.println("Table lamp adjusts brightness instead of flipping pages");
    }

    @Override
    public void hangOnWall() {
        System.out.println("Table lamp sits on a desk, not hung on a wall");
    }

    @Override
    public void checkDay() {
        System.out.println("Table lamp does not display days of the week");
    }

    public void turnOn() {
        System.out.println("Turning on the table lamp");
    }

    public void adjustBrightness() {
        System.out.println("Adjusting brightness of the lamp");
    }

    public void rotateHead() {
        System.out.println("Rotating the lamp head for better lighting angle");
    }

    public void turnOff() {
        System.out.println("Turning off the table lamp");
    }
}
