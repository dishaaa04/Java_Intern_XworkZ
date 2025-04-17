package com.xworkz.interfaceexample;

public class TaskExecutorImpl implements TaskExecutor {

    Runnable currentTask;

    @Override
    public void executeTask(Runnable task) {
        currentTask = task;
        if(currentTask != null) {
            currentTask.run();
        }
    }

    @Override
    public void cancelTask() {
        currentTask = null;
        System.out.println("Task cancelled.");
    }
}
