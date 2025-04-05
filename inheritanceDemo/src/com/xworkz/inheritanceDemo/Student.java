package com.xworkz.inheritanceDemo;

public class Student extends Human {

    public Student() {
        super();
        System.out.println("Student object created");
    }

    @Override
    public void eat() {
        System.out.println("Student is eating in the canteen");
    }

    @Override
    public void sleep() {
        System.out.println("Student is sleeping after study");
    }

    @Override
    public void walk() {
        System.out.println("Student is walking to class");
    }

    @Override
    public void talk() {
        System.out.println("Student is talking with friends");
    }

    @Override
    public void think() {
        System.out.println("Student is thinking about exams");
    }

    public void study() {
        System.out.println("Student is studying for exams");
    }

    public void attendClasses() {
        System.out.println("Student is attending classes");
    }

    public void doHomework() {
        System.out.println("Student is doing homework");
    }

    public void giveExams() {
        System.out.println("Student is giving exams");
    }

    public void participateInActivities() {
        System.out.println("Student is participating in activities");
    }
}
