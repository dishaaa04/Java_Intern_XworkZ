package com.xworkz.stringrepresntation;

public class OperatingSystemRunner {
    public static void main(String[] args) {
        OperatingSystem os = new OperatingSystem("Ubuntu", "22.04", true);
        System.out.println("operatingSystem" + os.toString());
    }
}
