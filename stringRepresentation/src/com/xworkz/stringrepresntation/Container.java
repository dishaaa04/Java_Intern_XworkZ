package com.xworkz.stringrepresntation;

public class Container {

    private String imageName;
    private int port;
    private boolean isRunning;

    public Container(String imageName, int port, boolean isRunning) {
        this.imageName = imageName;
        this.port = port;
        this.isRunning = isRunning;
    }

    @Override
    public String toString() {
        return "[imageName=" + imageName + ", port=" + port + ", isRunning=" + isRunning + "]";
    }
}
