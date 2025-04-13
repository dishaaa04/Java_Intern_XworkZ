package com.xworkz.stringrepresntation;

public class Mouse {
    private String type;
    private boolean wireless;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mouse) {
            Mouse other = (Mouse) obj;
            return this.type.equals(other.type) && this.wireless == other.wireless;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Mouse{type='" + type + "', wireless=" + wireless + "}";
    }

    @Override
    public int hashCode() {
        return type.hashCode() + Boolean.hashCode(wireless);
    }
}
