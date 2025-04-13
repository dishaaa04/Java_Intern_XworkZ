package com.xworkz.stringrepresntation;

public class Keyboard {
    private String layout;
    private boolean wireless;

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Keyboard) {
            Keyboard other = (Keyboard) obj;
            return this.layout.equals(other.layout) && this.wireless == other.wireless;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Keyboard{layout='" + layout + "', wireless=" + wireless + "}";
    }

    @Override
    public int hashCode() {
        return layout.hashCode() + Boolean.hashCode(wireless);
    }
}
