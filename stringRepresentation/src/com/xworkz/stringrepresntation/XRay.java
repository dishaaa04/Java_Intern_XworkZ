package com.xworkz.stringrepresntation;

public class XRay {
    private String bodyPart;

    public String getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof XRay) {
            XRay other = (XRay) obj;
            return this.bodyPart.equals(other.bodyPart);
        }
        return false;
    }

    @Override
    public String toString() {
        return "XRay{bodyPart='" + bodyPart + "'}";
    }

    @Override
    public int hashCode() {
        return bodyPart.hashCode();
    }
}
