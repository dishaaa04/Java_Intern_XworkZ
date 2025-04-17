package com.xworkz.interfaceexample;

public class DebugConsoleImpl implements DebugConsole {

    @Override
    public void printDebugMessage(String message) {
        System.out.println("Debug: " + message);
    }

    @Override
    public void clearConsole() {
        System.out.println("Console cleared.");
    }
}
