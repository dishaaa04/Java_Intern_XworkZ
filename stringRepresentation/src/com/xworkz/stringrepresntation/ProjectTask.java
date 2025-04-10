package com.xworkz.stringrepresntation;

public class ProjectTask {
    private String title;
    private String status;
    private int durationDays;

    public ProjectTask(String title, String status, int durationDays) {
        this.title = title;
        this.status = status;
        this.durationDays = durationDays;
    }

    @Override
    public String toString() {
        return "[title=" + title + ", status=" + status + ", durationDays=" + durationDays + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 4700;
    }
}
