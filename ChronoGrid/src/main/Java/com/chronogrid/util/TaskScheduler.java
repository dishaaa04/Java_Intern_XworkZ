package com.chronogrid.util;



import com.chronogrid.model.Task;
import java.util.Timer;
import java.util.TimerTask;

public class TaskScheduler {
    public void schedule(Task task) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Executing: " + task.getCommand());
                // logic to run the command
            }
        }, 0, 60000); // every 1 min for demo
    }
}