package com.xworkz.stringrepresntation;

public class Bird {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bird) {
            Bird other = (Bird) obj;
            return this.name.equals(other.name);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bird{name='" + name + "'}";
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
