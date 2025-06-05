package com.chronogrid.model;
import java.time.LocalDateTime;
import java.time.LocalDateTime;

public class Task {
    private int id;
    private String name;
    private String description;
    private String status;
    private String command;
    private String schedule;
    private LocalDateTime createdAt;

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getStatus() { return status; }
    public String getCommand() { return command; }
    public String getSchedule() { return schedule; }
    public LocalDateTime getCreatedAt() { return createdAt; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setStatus(String status) { this.status = status; }
    public void setCommand(String command) { this.command = command; }
    public void setSchedule(String schedule) { this.schedule = schedule; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
