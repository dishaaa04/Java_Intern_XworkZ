package com.xworkz.stringrepresntation;

public class OperatingSystem {

    private String name;
    private String version;
    private boolean is64Bit;

    public OperatingSystem(String name, String version, boolean is64Bit) {
        this.name = name;
        this.version = version;
        this.is64Bit = is64Bit;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", version=" + version + ", is64Bit=" + is64Bit + "]";
    }
}
