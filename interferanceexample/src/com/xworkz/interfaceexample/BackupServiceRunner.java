package com.xworkz.interfaceexample;

public class BackupServiceRunner {
    public static void main(String[] args) {
        BackupService backup = new BackupServiceImpl();
        backup.startBackup();
        backup.restoreBackup();
        backup.scheduleBackup();
    }
}
