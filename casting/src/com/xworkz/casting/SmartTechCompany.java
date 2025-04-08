package com.xworkz.casting;

public class SmartTechCompany extends TechCompany {

    @Override
    public void startBusiness() {
        System.out.println("Smart tech company starts with AI-based solutions.");
    }

    public void manageCompany(Company company) {
        System.out.println("Managing company...");

        company.startBusiness();
        company.employees();

        if (company instanceof TechCompany) {
            System.out.println("It's a Tech Company.");
            TechCompany tech = (TechCompany) company;
            tech.developSoftware();
            tech.location();
        }
    }
}
