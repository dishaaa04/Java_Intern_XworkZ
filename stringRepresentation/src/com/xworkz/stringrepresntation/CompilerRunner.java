package com.xworkz.stringrepresntation;

public class CompilerRunner {
    public static void main(String[] args) {

        Compiler compiler1 = new Compiler();
        compiler1.setLanguage("Java");

        Compiler compiler2 = new Compiler();
        compiler2.setLanguage("Java");

        System.out.println("Checking same location: " + (compiler1 == compiler2));
        boolean same = compiler1.equals(compiler2);
        System.out.println("compiler1 is same as compiler2: " + same);
    }
}
