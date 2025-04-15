package com.xworkz.abstractexample;

abstract class Abstract5 {
    int x, y, z, w;

    Abstract5(int x) {
        this.x = x;
    }

    Abstract5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Abstract5(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void printData() {
        System.out.println("Abstract5: x=" + x + ", y=" + y + ", z=" + z + ", w=" + w);
    }
}



