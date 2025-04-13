package com.xworkz.stringrepresntation;

public class ProjectTask {
    private String taskName;
    private int duration;
    private String status;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof ProjectTask) {
            ProjectTask other = (ProjectTask) obj;
            return this.taskName.equals(other.taskName)
                    && this.duration == other.duration
                    && this.status.equals(other.status);
        }
        return false;
    }

    @Override
    public String toString() {
        return "ProjectTask{taskName='" + taskName + "', duration=" + duration + ", status='" + status + "'}";
    }

    @Override
    public int hashCode() {
        return taskName.hashCode() + duration + status.hashCode();
    }
}
