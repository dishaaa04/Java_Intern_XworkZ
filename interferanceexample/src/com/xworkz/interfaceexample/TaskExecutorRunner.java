package com.xworkz.interfaceexample;

public class TaskExecutorRunner {
    public static void main(String[] args) {
        TaskExecutor executor = new TaskExecutorImpl();
        executor.executeTask(() -> System.out.println("Executing task..."));
        executor.cancelTask();
    }
}
