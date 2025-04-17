package com.xworkz.interfaceexample;

public interface TaskExecutor {
    void executeTask(Runnable task);
    void cancelTask();
}
