package com.xworkz.stringrepresntation;

public class ProjectTaskRunner {
    public static void main(String[] args) {
        ProjectTask task1 = new ProjectTask();
        task1.setTaskName("Design Module");
        task1.setDuration(5);
        task1.setStatus("In Progress");

        ProjectTask task2 = new ProjectTask();
        task2.setTaskName("Design Module");
        task2.setDuration(5);
        task2.setStatus("In Progress");

        System.out.println("Checking same location: " + (task1 == task2));
        boolean same = task1.equals(task2);
        System.out.println("task1 is same as task2: " + same);
    }
}
