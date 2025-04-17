package com.xworkz.interfaceexample;

public class ThreadPoolExecutorRunner {
    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutorImpl();

        poolExecutor.executeTask(() -> System.out.println("Task 1"));
        poolExecutor.executeTask(() -> System.out.println("Task 2"));

        poolExecutor.shutdown();
    }
}
