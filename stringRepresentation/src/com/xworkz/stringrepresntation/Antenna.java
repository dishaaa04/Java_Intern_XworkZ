package com.xworkz.stringrepresntation;

public class Antenna {
    private String frequencyRange;

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Antenna) {
            Antenna other = (Antenna) obj;
            return this.frequencyRange.equals(other.frequencyRange);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Antenna{frequencyRange='" + frequencyRange + "'}";
    }

    @Override
    public int hashCode() {
        return frequencyRange.hashCode();
    }
}
