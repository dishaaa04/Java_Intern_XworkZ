package com.xworkz.interfaceexample;

public class CodeCompilerImpl implements CodeCompiler {

    boolean hasErrors = false;

    @Override
    public void compileCode(String code) {
        if (code.contains("error")) {
            hasErrors = true;
            System.out.println("Compilation failed.");
        } else {
            hasErrors = false;
            System.out.println("Code compiled successfully.");
        }
    }

    @Override
    public void showErrors() {
        if (hasErrors) {
            System.out.println("Syntax error in code.");
        } else {
            System.out.println("No errors found.");
        }
    }

    @Override
    public void executeProgram() {
        if (!hasErrors) {
            System.out.println("Program is running...");
        } else {
            System.out.println("Cannot run program. Fix errors first.");
        }
    }
}
