package com.xworkz.interfaceexample;

public class ConfigurationLoaderRunner {
    public static void main(String[] args) {
        ConfigurationLoader loader = new ConfigurationLoaderImpl();
        loader.displayConfiguration();
        loader.loadConfiguration();
        loader.displayConfiguration();
        loader.resetConfiguration();
        loader.displayConfiguration();
    }
}
