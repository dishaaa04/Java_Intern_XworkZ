package com.xworkz.stringrepresntation;

public class ContainerRunner {
    public static void main(String[] args) {
        Container container = new Container("nginx:latest", 8080, true);
        System.out.println("container" + container.toString());
    }
}
