package com.xworkz.casting;

public class CompanyRunner {

    public static void main(String[] args) {

        Company company = new TechCompany();
        company.startBusiness();
        company.stopBusiness();
        company.location();
        company.employees();

        System.out.println("----");

        TechCompany tech = new TechCompany();
        tech.startBusiness();
        tech.developSoftware();
        tech.location();
        tech.stopBusiness();

        System.out.println("----");

        SmartTechCompany smart = new SmartTechCompany();
        smart.startBusiness();
        smart.developSoftware();
        smart.location();

        System.out.println("----");

        smart.manageCompany(new TechCompany());
    }
}
