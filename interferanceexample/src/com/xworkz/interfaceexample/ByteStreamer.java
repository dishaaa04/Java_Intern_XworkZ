package com.xworkz.interfaceexample;

public interface ByteStreamer {
    void startStreaming();
    void stopStreaming();
    void adjustBitrate(int bitrate);
}
