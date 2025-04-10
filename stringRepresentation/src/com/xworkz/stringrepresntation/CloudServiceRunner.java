package com.xworkz.stringrepresntation;

public class CloudServiceRunner {
    public static void main(String[] args) {
        CloudService service = new CloudService("AWS", 500, true);
        System.out.println("cloudService = " + service.toString());

        int code = service.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("backup = " + "backup".hashCode());
        System.out.println("compute = " + "compute".hashCode());
        System.out.println("security = " + "security".hashCode());
    }
}
