package com.xworkz.stringrepresntation;

public class XRay {
    private String bodyPart;
    private boolean isDigital;
    private double cost;

    public XRay(String bodyPart, boolean isDigital, double cost) {
        this.bodyPart = bodyPart;
        this.isDigital = isDigital;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "[bodyPart=" + bodyPart + ", isDigital=" + isDigital + ", cost=" + cost + "]";
    }

    @Override
    public int hashCode() {
        System.out.println("value " + super.hashCode());
        return 8100;
    }
}
