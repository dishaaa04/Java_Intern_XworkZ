package com.xworkz.stringrepresntation;

public class Alien {
    private String planet;

    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Alien) {
                Alien other = (Alien) obj;
                return this.planet.equals(other.planet);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Alien{planet='" + planet + "'}";
    }

    @Override
    public int hashCode() {
        return planet.hashCode();
    }
}
