package com.xworkz.stringrepresntation;

public class DevOpsToolRunner {
    public static void main(String[] args) {
        DevOpsTool tool = new DevOpsTool("Jenkins", "CI/CD", true);
        System.out.println("devOpsTool" + tool.toString());
    }
}
