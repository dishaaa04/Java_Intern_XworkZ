package com.xworkz.interfaceexample;

public class BackupServiceImpl implements BackupService {

    public void startBackup() {
        System.out.println("Backup started");
    }

    public void restoreBackup() {
        System.out.println("Backup restored");
    }

    public void scheduleBackup() {
        System.out.println("Backup scheduled");
    }
}
