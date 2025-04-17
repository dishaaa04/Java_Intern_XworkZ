package com.xworkz.interfaceexample;

public class TaskSchedulerRunner {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskSchedulerImpl();
        scheduler.scheduleTask(() -> System.out.println("Executing scheduled task."));
        scheduler.runScheduledTask();
        scheduler.cancelScheduledTask();
        scheduler.runScheduledTask();
    }
}
