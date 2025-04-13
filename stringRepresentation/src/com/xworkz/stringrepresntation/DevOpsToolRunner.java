package com.xworkz.stringrepresntation;

public class DevOpsToolRunner {
    public static void main(String[] args) {

        DevOpsTool tool1 = new DevOpsTool();
        tool1.setName("Docker");

        DevOpsTool tool2 = new DevOpsTool();
        tool2.setName("Docker");

        System.out.println("Checking same location: " + (tool1 == tool2));
        boolean same = tool1.equals(tool2);
        System.out.println("tool1 is same as tool2: " + same);
    }
}
