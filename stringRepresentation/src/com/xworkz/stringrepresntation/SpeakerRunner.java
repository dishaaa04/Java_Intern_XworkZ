package com.xworkz.stringrepresntation;

public class SpeakerRunner {
    public static void main(String[] args) {
        Speaker speaker = new Speaker("JBL", 40, true);
        System.out.println("speaker = " + speaker.toString());

        int code = speaker.hashCode();
        System.out.println("value using ref = " + code);

        System.out.println("hash code sets");
        System.out.println("sound = " + "sound".hashCode());
        System.out.println("bass = " + "bass".hashCode());
        System.out.println("music = " + "music".hashCode());
    }
}
