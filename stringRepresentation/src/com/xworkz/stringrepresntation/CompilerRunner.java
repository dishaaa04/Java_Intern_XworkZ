package com.xworkz.stringrepresntation;

public class CompilerRunner {
    public static void main(String[] args) {
        Compiler compiler = new Compiler("Java", "17", true);
        System.out.println("compiler = " + compiler.toString());

        int code = compiler.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("javac = " + "javac".hashCode());
        System.out.println("clang = " + "clang".hashCode());
        System.out.println("gcc = " + "gcc".hashCode());
    }
}
