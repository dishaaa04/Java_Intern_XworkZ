package com.xworkz.inheritanceDemo;

public class Camera extends Photo {

    public Camera() {
        System.out.println("Camera object created");
    }

    @Override
    public void gallery() {
        System.out.println("Camera saves photos to gallery");
    }

    @Override
    public void click() {
        System.out.println("Camera is clicking a photo");
    }

    @Override
    public void memories() {
        System.out.println("Camera stores precious memories");
    }

    @Override
    public void phone() {
        System.out.println("Camera can be connected to phone");
    }

    @Override
    public void safe() {
        System.out.println("Camera stores photos securely");
    }

    public void capture() {
        System.out.println("Camera is capturing an image");
    }

    public void delete() {
        System.out.println("Camera is deleting a photo");
    }

    public void focus() {
        System.out.println("Camera is focusing");
    }

    public void light() {
        System.out.println("Camera is using flash");
    }

    public void store() {
        System.out.println("Camera is storing the image");
    }
}
