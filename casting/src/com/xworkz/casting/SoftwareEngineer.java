package com.xworkz.casting;

public class SoftwareEngineer extends Engineer {

    @Override
    public void work() {
        System.out.println("Software Engineer is coding.");
    }

    @Override
    public void field() {
        System.out.println("Field: Software Development");
    }

    public void techStack() {
        System.out.println("Tech Stack: Java, Python, SQL");
    }

    @Override
    public void location() {
        System.out.println("Location: Tech Park");
    }
}
