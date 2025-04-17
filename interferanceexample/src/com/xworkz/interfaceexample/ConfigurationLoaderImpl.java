package com.xworkz.interfaceexample;

public class ConfigurationLoaderImpl implements ConfigurationLoader {

    String config = "Default";

    @Override
    public void loadConfiguration() {
        config = "Loaded Configuration v1.0";
        System.out.println("Configuration loaded.");
    }

    @Override
    public void displayConfiguration() {
        System.out.println("Current Configuration: " + config);
    }

    @Override
    public void resetConfiguration() {
        config = "Default";
        System.out.println("Configuration reset.");
    }
}
