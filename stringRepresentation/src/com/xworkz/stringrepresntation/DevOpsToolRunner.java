package com.xworkz.stringrepresntation;

public class DevOpsToolRunner {
    public static void main(String[] args) {
        DevOpsTool tool = new DevOpsTool("Jenkins", "CI/CD", true);
        System.out.println("devOpsTool = " + tool.toString());

        int code = tool.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("docker = " + "docker".hashCode());
        System.out.println("kubernetes = " + "kubernetes".hashCode());
        System.out.println("ansible = " + "ansible".hashCode());
    }
}
