package com.xworkz.stringrepresntation;

public class DevOpsTool {

    private String name;
    private String purpose;
    private boolean openSource;

    public DevOpsTool(String name, String purpose, boolean openSource) {
        this.name = name;
        this.purpose = purpose;
        this.openSource = openSource;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", purpose=" + purpose + ", openSource=" + openSource + "]";
    }
}
