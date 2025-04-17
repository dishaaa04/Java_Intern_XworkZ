package com.xworkz.interfaceexample;

public class DebugConsoleRunner {
    public static void main(String[] args) {
        DebugConsole console = new DebugConsoleImpl();
        console.printDebugMessage("Initializing the system...");
        console.printDebugMessage("System started successfully.");
        console.clearConsole();
    }
}
