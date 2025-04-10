package com.xworkz.stringrepresntation;

public class Window {
    private String frameMaterial;
    private int panes;
    private boolean isOpenable;

    public Window(String frameMaterial, int panes, boolean isOpenable) {
        this.frameMaterial = frameMaterial;
        this.panes = panes;
        this.isOpenable = isOpenable;
    }

    @Override
    public String toString() {
        return "[frameMaterial=" + frameMaterial + ", panes=" + panes + ", isOpenable=" + isOpenable + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 7800;
    }
}
