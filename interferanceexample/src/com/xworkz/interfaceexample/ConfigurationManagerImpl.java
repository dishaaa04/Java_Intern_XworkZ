package com.xworkz.interfaceexample;

public class ConfigurationManagerImpl implements ConfigurationManager {

    String currentConfig;

    @Override
    public void setConfiguration(String config) {
        currentConfig = config;
        System.out.println("Configuration set to: " + config);
    }

    @Override
    public void getConfiguration() {
        System.out.println("Current Configuration: " + currentConfig);
    }

    @Override
    public void clearConfiguration() {
        currentConfig = null;
        System.out.println("Configuration cleared.");
    }
}
