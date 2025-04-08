package com.xworkz.casting;

public class ExperienceRunner {

    public static void main(String[] args) {

        Experience exp = new WorkExperience();
        exp.duration();
        exp.domain();
        exp.level();
        exp.company();

        System.out.println("----");

        WorkExperience work = new WorkExperience();
        work.duration();
        work.technologies();
        work.domain();
        work.company();

        System.out.println("----");

        SmartExperience smart = new SmartExperience();
        smart.duration();
        smart.technologies();
        smart.domain();

        System.out.println("----");

        smart.manageExperience(new WorkExperience());
    }
}
