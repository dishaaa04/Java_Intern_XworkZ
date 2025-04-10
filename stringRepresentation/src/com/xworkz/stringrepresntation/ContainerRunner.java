package com.xworkz.stringrepresntation;

public class ContainerRunner {
    public static void main(String[] args) {
        Container container = new Container("Steel", 5.0, true);
        System.out.println("container = " + container.toString());

        int code = container.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("jar = " + "jar".hashCode());
        System.out.println("box = " + "box".hashCode());
        System.out.println("bottle = " + "bottle".hashCode());
    }
}
