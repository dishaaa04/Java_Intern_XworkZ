package com.xworkz.stringrepresntation;

public class ProjectTask {

    private String taskName;
    private String assignedTo;
    private boolean isCompleted;

    public ProjectTask(String taskName, String assignedTo, boolean isCompleted) {
        this.taskName = taskName;
        this.assignedTo = assignedTo;
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "[taskName=" + taskName + ", assignedTo=" + assignedTo + ", isCompleted=" + isCompleted + "]";
    }
}
