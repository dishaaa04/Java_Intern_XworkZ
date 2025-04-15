package com.xworkz.hierarchicalinheritancetype;

public class HierarchicalInheritanceRunner {
    public static void main(String[] args) {

        System.out.println("=== Example 1: Sensor ===");
        TemperatureSensor tempSensor = new TemperatureSensor();
        tempSensor.readData();
        tempSensor.measureTemp();

        PressureSensor pressureSensor = new PressureSensor();
        pressureSensor.readData();
        pressureSensor.measurePressure();

        System.out.println("\n=== Example 2: VehicleControl ===");
        BrakeSystem brake = new BrakeSystem();
        brake.control();
        brake.applyBrake();

        SteeringSystem steering = new SteeringSystem();
        steering.control();
        steering.turnSteering();

        System.out.println("\n=== Example 3: Payment ===");
        CreditCardPayment credit = new CreditCardPayment();
        credit.pay();
        credit.validateCard();

        UpiPayment upi = new UpiPayment();
        upi.pay();
        upi.scanQr();

        System.out.println("\n=== Example 4: CloudStorage ===");
        GoogleDrive gDrive = new GoogleDrive();
        gDrive.sync();
        gDrive.shareFile();

        Dropbox dropbox = new Dropbox();
        dropbox.sync();
        dropbox.uploadFile();

        System.out.println("\n=== Example 5: Camera ===");
        DSLRCamera dslr = new DSLRCamera();
        dslr.focus();
        dslr.adjustLens();

        ActionCamera action = new ActionCamera();
        action.focus();
        action.recordAdventure();

        System.out.println("\n=== Example 6: CodeRepository ===");
        GitHub github = new GitHub();
        github.cloneRepo();
        github.createIssue();

        GitLab gitlab = new GitLab();
        gitlab.cloneRepo();
        gitlab.mergeRequest();

        System.out.println("\n=== Example 7: SmartHomeDevice ===");
        SmartLight light = new SmartLight();
        light.connectToWiFi();
        light.changeColor();

        SmartThermostat thermostat = new SmartThermostat();
        thermostat.connectToWiFi();
        thermostat.setTemperature();

        System.out.println("\n=== Example 8: Notification ===");
        EmailNotification email = new EmailNotification();
        email.send();
        email.attachFile();

        SmsNotification sms = new SmsNotification();
        sms.send();
        sms.sendOtp();

        System.out.println("\n=== Example 9: Report ===");
        SalesReport sales = new SalesReport();
        sales.generate();
        sales.showRevenue();

        PerformanceReport performance = new PerformanceReport();
        performance.generate();
        performance.evaluatePerformance();

        System.out.println("\n=== Example 10: InputDevice ===");
        Keyboard keyboard = new Keyboard();
        keyboard.detectInput();
        keyboard.typeKeys();

        Mouse mouse = new Mouse();
        mouse.detectInput();
        mouse.movePointer();

        System.out.println("\n=== Example 11: Authenticator ===");
        FingerprintAuth fingerprint = new FingerprintAuth();
        fingerprint.authenticate();
        fingerprint.scanFingerprint();

        FaceIDAuth faceid = new FaceIDAuth();
        faceid.authenticate();
        faceid.scanFace();
    }
}
