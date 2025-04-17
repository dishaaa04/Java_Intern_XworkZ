package com.xworkz.interfaceexample;

public class CodeCompilerRunner {
    public static void main(String[] args) {
        CodeCompiler compiler = new CodeCompilerImpl();
        compiler.compileCode("System.out.println('Hello');");
        compiler.showErrors();
        compiler.executeProgram();

        compiler.compileCode("error missing semicolon");
        compiler.showErrors();
        compiler.executeProgram();
    }
}
