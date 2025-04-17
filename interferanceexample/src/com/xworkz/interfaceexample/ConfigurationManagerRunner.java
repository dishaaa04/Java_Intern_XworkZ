package com.xworkz.interfaceexample;

public class ConfigurationManagerRunner {
    public static void main(String[] args) {
        ConfigurationManager manager = new ConfigurationManagerImpl();
        manager.getConfiguration();
        manager.setConfiguration("Prod-Mode Enabled");
        manager.getConfiguration();
        manager.clearConfiguration();
        manager.getConfiguration();
    }
}
