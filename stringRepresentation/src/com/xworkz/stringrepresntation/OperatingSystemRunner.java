package com.xworkz.stringrepresntation;

public class OperatingSystemRunner {
    public static void main(String[] args) {
        OperatingSystem os = new OperatingSystem("Linux", "Ubuntu 22.04", true);
        System.out.println("operatingSystem = " + os.toString());

        int code = os.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("kernel = " + "kernel".hashCode());
        System.out.println("GUI = " + "GUI".hashCode());
        System.out.println("terminal = " + "terminal".hashCode());
    }
}
