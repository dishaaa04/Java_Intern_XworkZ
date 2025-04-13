package com.xworkz.stringrepresntation;

public class ContainerRunner {
    public static void main(String[] args) {

        Container container1 = new Container();
        container1.setMaterial("Plastic");

        Container container2 = new Container();
        container2.setMaterial("Plastic");

        System.out.println("Checking same location: " + (container1 == container2));
        boolean same = container1.equals(container2);
        System.out.println("container1 is same as container2: " + same);
    }
}
