package com.xworkz.stringrepresntation;

public class Borewell {
    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Borewell) {
            Borewell other = (Borewell) obj;
            return this.location.equals(other.location);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Borewell{location='" + location + "'}";
    }

    @Override
    public int hashCode() {
        return location.hashCode();
    }
}
