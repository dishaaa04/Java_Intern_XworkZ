package com.xworkz.general.dto;


import java.io.Serializable;

public class JobDTO implements Serializable {
    private String name;
    private String email;
    private String education;
    private String skills;
    private double expectedSalary;
    private String experience;

    public JobDTO() {}

    public JobDTO(String name, String email, String education, String skills, double expectedSalary, String experience) {
        this.name = name;
        this.email = email;
        this.education = education;
        this.skills = skills;
        this.expectedSalary = expectedSalary;
        this.experience = experience;
    }

    // Getters and Setters
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getEducation() { return education; }
    public String getSkills() { return skills; }
    public double getExpectedSalary() { return expectedSalary; }
    public String getExperience() { return experience; }

    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setEducation(String education) { this.education = education; }
    public void setSkills(String skills) { this.skills = skills; }
    public void setExpectedSalary(double expectedSalary) { this.expectedSalary = expectedSalary; }
    public void setExperience(String experience) { this.experience = experience; }

    @Override
    public String toString() {
        return "JobDTO{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", education='" + education + '\'' +
                ", skills='" + skills + '\'' +
                ", expectedSalary=" + expectedSalary +
                ", experience='" + experience + '\'' +
                '}';
    }
}
