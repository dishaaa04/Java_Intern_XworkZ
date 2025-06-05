package com.chronogrid.model;

import java.time.LocalDateTime;

public class TaskHistory {
    private int id;
    private int taskId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;
    private String result;
    private String executionLog;

    public TaskHistory() {
        // Default constructor
    }

    public TaskHistory(int taskId, LocalDateTime startTime) {
        this.taskId = taskId;
        this.startTime = startTime;
        this.status = "RUNNING";
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getExecutionLog() {
        return executionLog;
    }

    public void setExecutionLog(String executionLog) {
        this.executionLog = executionLog;
    }

    // Get execution duration in seconds
    public long getDurationInSeconds() {
        if (startTime != null && endTime != null) {
            return java.time.Duration.between(startTime, endTime).getSeconds();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "TaskHistory{" +
                "id=" + id +
                ", taskId=" + taskId +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status='" + status + '\'' +
                ", result='" + (result != null ? result.substring(0, Math.min(result.length(), 50)) + "..." : "null") + '\'' +
                '}';
    }
}