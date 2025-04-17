package com.xworkz.interfaceexample;

public class CommandLineToolImpl implements CommandLineTool {

    boolean isRunning = true;

    @Override
    public void executeCommand(String command) {
        if (isRunning) {
            System.out.println("Executing: " + command);
        } else {
            System.out.println("Tool is not running.");
        }
    }

    @Override
    public void showHelp() {
        System.out.println("Available commands: execute, help, exit");
    }

    @Override
    public void exitTool() {
        isRunning = false;
        System.out.println("Command line tool exited.");
    }
}
