package com.xworkz.disha.tuesday;

class Camera {
    void takePhoto(Photo photo) {
        if (photo != null) {
            photo.capture();
        } else {
            System.out.println("No photo available!");
        }
    }
}
