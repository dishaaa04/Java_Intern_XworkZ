package com.xworkz.interfaceexample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutorImpl implements ThreadPoolExecutor{

    ExecutorService executor = Executors.newFixedThreadPool(2);

    @Override
    public void executeTask(Runnable task) {
        executor.execute(task);
    }

    @Override
    public void shutdown() {
        executor.shutdown();
    }
}
