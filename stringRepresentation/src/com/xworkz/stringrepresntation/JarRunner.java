package com.xworkz.stringrepresntation;

public class JarRunner {
    public static void main(String[] args) {

        Jar jar1 = new Jar();
        jar1.setMaterial("Glass");
        jar1.setCapacity(1000);

        Jar jar2 = new Jar();
        jar2.setMaterial("Glass");
        jar2.setCapacity(1000);

        System.out.println("Checking same location: " + (jar1 == jar2));
        boolean same = jar1.equals(jar2);
        System.out.println("jar1 is same as jar2: " + same);
    }
}
