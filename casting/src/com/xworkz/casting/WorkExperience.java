package com.xworkz.casting;

public class WorkExperience extends Experience {

    @Override
    public void duration() {
        System.out.println("Work experience duration: 3 years");
    }

    @Override
    public void domain() {
        System.out.println("Domain: Software Development");
    }

    public void technologies() {
        System.out.println("Technologies: Java, Spring, SQL");
    }

    @Override
    public void company() {
        System.out.println("Company: ABC Tech Pvt Ltd");
    }
}
