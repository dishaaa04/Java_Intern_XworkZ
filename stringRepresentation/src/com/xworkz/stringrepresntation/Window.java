package com.xworkz.stringrepresntation;

public class Window {
    private String frameType;

    public String getFrameType() {
        return frameType;
    }

    public void setFrameType(String frameType) {
        this.frameType = frameType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Window) {
            Window other = (Window) obj;
            return this.frameType.equals(other.frameType);
        }
        return false;
    }

    @Override
    public String toString() {
        return "Window{frameType='" + frameType + "'}";
    }

    @Override
    public int hashCode() {
        return frameType.hashCode();
    }
}
