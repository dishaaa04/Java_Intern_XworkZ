package com.xworkz.casting;

public class TechCompany extends Company {

    @Override
    public void startBusiness() {
        System.out.println("Tech company has launched its first product.");
    }

    @Override
    public void stopBusiness() {
        System.out.println("Tech company has temporarily paused operations.");
    }

    public void developSoftware() {
        System.out.println("Tech company is developing software.");
    }

    @Override
    public void location() {
        System.out.println("Located in Electronic City.");
    }
}
