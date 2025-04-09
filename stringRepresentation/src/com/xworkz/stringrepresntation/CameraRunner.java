package com.xworkz.stringrepresntation;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera("Canon", 24, true);
        System.out.println("camera" + camera.toString());
    }
}
