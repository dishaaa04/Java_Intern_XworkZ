package com.xworkz.interfaceexample;

public class ByteStreamerRunner {
    public static void main(String[] args) {
        ByteStreamer streamer = new ByteStreamerImpl();
        streamer.startStreaming();
        streamer.adjustBitrate(128);
        streamer.stopStreaming();
    }
}
