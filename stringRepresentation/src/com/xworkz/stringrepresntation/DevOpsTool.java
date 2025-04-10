package com.xworkz.stringrepresntation;

public class DevOpsTool {
    private String name;
    private String purpose;
    private boolean isOpenSource;

    public DevOpsTool(String name, String purpose, boolean isOpenSource) {
        this.name = name;
        this.purpose = purpose;
        this.isOpenSource = isOpenSource;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", purpose=" + purpose + ", isOpenSource=" + isOpenSource + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 1500;
    }
}
