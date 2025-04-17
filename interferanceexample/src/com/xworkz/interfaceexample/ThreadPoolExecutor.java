package com.xworkz.interfaceexample;

public interface ThreadPoolExecutor {
    void executeTask(Runnable task);
    void shutdown();
}
