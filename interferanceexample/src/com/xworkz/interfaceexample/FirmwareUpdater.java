package com.xworkz.interfaceexample;

public interface FirmwareUpdater {
    void updateFirmware(String version);
    void showUpdateStatus();
    void resetUpdater();
}
