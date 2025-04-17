package com.xworkz.interfaceexample;

public class ByteStreamerImpl implements ByteStreamer {

    @Override
    public void startStreaming() {
        System.out.println("Byte streaming started...");
    }

    @Override
    public void stopStreaming() {
        System.out.println("Byte streaming stopped.");
    }

    @Override
    public void adjustBitrate(int bitrate) {
        System.out.println("Bitrate adjusted to " + bitrate + " kbps.");
    }
}
