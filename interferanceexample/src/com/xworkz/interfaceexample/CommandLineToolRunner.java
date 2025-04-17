package com.xworkz.interfaceexample;

public class CommandLineToolRunner {
    public static void main(String[] args) {
        CommandLineTool tool = new CommandLineToolImpl();
        tool.showHelp();
        tool.executeCommand("dir");
        tool.exitTool();
        tool.executeCommand("ls");
    }
}
