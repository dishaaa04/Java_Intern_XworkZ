package com.xworkz.casting;

public class SmartExperience extends WorkExperience {

    @Override
    public void duration() {
        System.out.println("Smart experience uses AI to track progress over 5 years.");
    }

    public void manageExperience(Experience experience) {
        System.out.println("Managing experience details...");

        experience.duration();
        experience.domain();

        if (experience instanceof WorkExperience) {
            System.out.println("It's WorkExperience.");
            WorkExperience work = (WorkExperience) experience;
            work.technologies();
            work.company();
        }
    }
}
