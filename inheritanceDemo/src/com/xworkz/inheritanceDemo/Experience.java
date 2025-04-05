package com.xworkz.inheritanceDemo;

public class Experience extends Company {

    Experience() {
        super();
        System.out.println("Gaining work experience");
    }

    @Override
    public void work() {
        System.out.println("Working with hands-on industry projects");
    }

    @Override
    public void meeting() {
        System.out.println("Attending team and client meetings");
    }

    @Override
    public void projects() {
        System.out.println("Managing real-time challenging projects");
    }

    @Override
    public void salary() {
        System.out.println("Receiving experience-based salary hikes");
    }

    @Override
    public void benefits() {
        System.out.println("Availing experience-level benefits");
    }

    public void learning() {
        System.out.println("Learning new technologies");
    }

    public void challenges() {
        System.out.println("Facing workplace challenges");
    }

    public void teamwork() {
        System.out.println("Collaborating with teams");
    }

    public void promotions() {
        System.out.println("Getting promoted based on experience");
    }

    public void networking() {
        System.out.println("Building professional network");
    }
}
