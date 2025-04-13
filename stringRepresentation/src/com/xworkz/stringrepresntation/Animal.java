package com.xworkz.stringrepresntation;

public class Animal {
    private String species;

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Animal) {
                Animal other = (Animal) obj;
                return this.species.equals(other.species);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Animal{species='" + species + "'}";
    }

    @Override
    public int hashCode() {
        return species.hashCode();
    }
}
