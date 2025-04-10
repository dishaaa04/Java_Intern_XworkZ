package com.xworkz.stringrepresntation;

public class JarRunner {
    public static void main(String[] args) {
        Jar jar = new Jar("Plastic", 750, true);
        System.out.println("jar = " + jar.toString());

        int code = jar.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("lid = " + "lid".hashCode());
        System.out.println("base = " + "base".hashCode());
        System.out.println("handle = " + "handle".hashCode());
    }
}