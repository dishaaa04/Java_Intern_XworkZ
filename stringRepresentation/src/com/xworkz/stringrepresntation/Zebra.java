package com.xworkz.stringrepresntation;

public class Zebra {
    private String origin;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Zebra) {
            Zebra other = (Zebra) obj;
            return this.origin.equals(other.origin);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Zebra{origin='" + origin + "'}";
    }

    @Override
    public int hashCode() {
        return origin.hashCode();
    }
}
