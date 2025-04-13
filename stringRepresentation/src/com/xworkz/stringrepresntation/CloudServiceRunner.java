package com.xworkz.stringrepresntation;

public class CloudServiceRunner {
    public static void main(String[] args) {

        CloudService service1 = new CloudService();
        service1.setType("IaaS");

        CloudService service2 = new CloudService();
        service2.setType("IaaS");

        System.out.println("Checking same location: " + (service1 == service2));
        boolean same = service1.equals(service2);
        System.out.println("service1 is same as service2: " + same);
    }
}
