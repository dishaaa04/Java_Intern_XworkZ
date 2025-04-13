package com.xworkz.stringrepresntation;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker speaker1 = new Speaker();
        speaker1.setBrand("JBL");
        speaker1.setBluetooth(true);
        speaker1.setPowerOutput(60);

        Speaker speaker2 = new Speaker();
        speaker2.setBrand("JBL");
        speaker2.setBluetooth(true);
        speaker2.setPowerOutput(60);

        System.out.println("Checking same location: " + (speaker1 == speaker2));
        boolean same = speaker1.equals(speaker2);
        System.out.println("speaker1 is same as speaker2: " + same);
    }
}
