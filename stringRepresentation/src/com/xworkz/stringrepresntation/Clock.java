package com.xworkz.stringrepresntation;

public class Clock {
    private String type;
    private boolean hasAlarm;
    private String display;

    public Clock(String type, boolean hasAlarm, String display) {
        this.type = type;
        this.hasAlarm = hasAlarm;
        this.display = display;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", hasAlarm=" + hasAlarm + ", display=" + display + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 555;
    }
}
