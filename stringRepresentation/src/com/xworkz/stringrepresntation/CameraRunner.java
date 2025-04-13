package com.xworkz.stringrepresntation;

public class CameraRunner {
    public static void main(String[] args) {

        Camera camera1 = new Camera();
        camera1.setBrand("Canon");

        Camera camera2 = new Camera();
        camera2.setBrand("Canon");

        System.out.println("Checking same location: " + (camera1 == camera2));
        boolean same = camera1.equals(camera2);
        System.out.println("camera1 is same as camera2: " + same);
    }
}
