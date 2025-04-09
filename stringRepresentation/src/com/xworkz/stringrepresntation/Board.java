package com.xworkz.stringrepresntation;

public class Board {

    private String type;
    private int size;
    private String material;

    public Board(String type, int size, String material) {
        this.type = type;
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return "[type=" + type + ", size=" + size + ", material=" + material + "]";
    }
}
