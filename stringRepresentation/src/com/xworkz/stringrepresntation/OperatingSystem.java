package com.xworkz.stringrepresntation;

public class OperatingSystem {
    private String name;
    private int version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof OperatingSystem) {
            OperatingSystem other = (OperatingSystem) obj;
            return this.name.equals(other.name) && this.version == other.version;
        }
        return false;
    }

    @Override
    public String toString() {
        return "OperatingSystem{name='" + name + "', version=" + version + "}";
    }

    @Override
    public int hashCode() {
        return name.hashCode() + version;
    }
}
