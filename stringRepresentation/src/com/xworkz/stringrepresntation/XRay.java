package com.xworkz.stringrepresntation;

public class XRay {

    private String bodyPart;
    private String type;
    private boolean isDigital;

    public XRay(String bodyPart, String type, boolean isDigital) {
        this.bodyPart = bodyPart;
        this.type = type;
        this.isDigital = isDigital;
    }

    @Override
    public String toString() {
        return "[bodyPart=" + bodyPart + ", type=" + type + ", isDigital=" + isDigital + "]";
    }
}
