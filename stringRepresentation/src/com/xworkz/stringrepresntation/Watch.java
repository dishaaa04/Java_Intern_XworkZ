package com.xworkz.stringrepresntation;

public class Watch {
    private String type;
    private String strapMaterial;
    private boolean isSmart;

    public Watch(String type, String strapMaterial, boolean isSmart) {
        this.type = type;
        this.strapMaterial = strapMaterial;
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", strapMaterial=" + strapMaterial + ", isSmart=" + isSmart + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 7600;
    }
}
