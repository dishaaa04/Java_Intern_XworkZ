package com.xworkz.interfaceexample;

public class FirmwareUpdaterImpl implements FirmwareUpdater {

    String status;

    @Override
    public void updateFirmware(String version) {
        status = "Firmware updated to version " + version;
        System.out.println("Updating firmware to " + version);
    }

    @Override
    public void showUpdateStatus() {
        if (status != null) {
            System.out.println("Status: " + status);
        } else {
            System.out.println("No update performed.");
        }
    }

    @Override
    public void resetUpdater() {
        status = null;
        System.out.println("Updater reset.");
    }
}
