package com.xworkz.interfaceexample;

public class TaskSchedulerImpl implements TaskScheduler {

    Runnable scheduledTask;

    @Override
    public void scheduleTask(Runnable task) {
        scheduledTask = task;
        System.out.println("Task scheduled.");
    }

    @Override
    public void runScheduledTask() {
        if(scheduledTask != null) {
            scheduledTask.run();
        } else {
            System.out.println("No task to run.");
        }
    }

    @Override
    public void cancelScheduledTask() {
        scheduledTask = null;
        System.out.println("Task cancelled.");
    }
}
