package com.xworkz.stringrepresntation;

public class Xylophone {
    private int keys;
    private String material;
    private boolean isTuned;

    public Xylophone(int keys, String material, boolean isTuned) {
        this.keys = keys;
        this.material = material;
        this.isTuned = isTuned;
    }

    @Override
    public String toString() {
        return "[keys=" + keys + ", material=" + material + ", isTuned=" + isTuned + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 8200;
    }
}
