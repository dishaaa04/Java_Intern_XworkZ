package com.xworkz.stringrepresntation;

public class Zoo {
    private String city;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Zoo) {
            Zoo other = (Zoo) obj;
            return this.city.equals(other.city);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Zoo{city='" + city + "'}";
    }

    @Override
    public int hashCode() {
        return city.hashCode();
    }
}
