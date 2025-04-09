package com.xworkz.stringrepresntation;

public class CompilerRunner {
    public static void main(String[] args) {
        Compiler compiler = new Compiler("Java", "17", true);
        System.out.println("compiler" + compiler.toString());
    }
}
