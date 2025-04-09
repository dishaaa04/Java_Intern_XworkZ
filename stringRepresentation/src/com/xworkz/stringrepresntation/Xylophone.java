package com.xworkz.stringrepresntation;

public class Xylophone {

    private int keys;
    private String material;
    private String scale;

    public Xylophone(int keys, String material, String scale) {
        this.keys = keys;
        this.material = material;
        this.scale = scale;
    }

    @Override
    public String toString() {
        return "[keys=" + keys + ", material=" + material + ", scale=" + scale + "]";
    }
}
