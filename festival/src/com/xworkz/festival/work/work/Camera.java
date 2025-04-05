package com.xworkz.fest.work.work;

public class Camera extends Photo{

    Camera(){

        super();
        System.out.println("Digital camera");
    }

    public void store(){

        System.out.println("camera stors photos");
    }

    public void delete(){

        System.out.println("delete the photos");
    }

    public void light(){

        System.out.println(" camera have light");
    }

    public void focus(){

        System.out.println("focus the light");
    }

    public void capture(){

        System.out.println("camera captures the moment");
    }
}
