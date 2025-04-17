package com.xworkz.interfaceexample;

public interface TaskScheduler {
    void scheduleTask(Runnable task);
    void runScheduledTask();
    void cancelScheduledTask();
}
