public class IoTSensor {
    // Constructor
    public IoTSensor() {
        System.out.println("IoT Sensor class initialized");
    }

    // 5 instance methods in parent class
    public void collectData() {
        System.out.println("IoT Sensor is collecting data");
    }

    public void sendData() {
        System.out.println("IoT Sensor is sending data to the cloud");
    }

    public void monitorEnvironment() {
        System.out.println("IoT Sensor is monitoring the environment");
    }

    public void triggerAlert() {
        System.out.println("IoT Sensor is triggering an alert");
    }

    public void displayInfo() {
        System.out.println("This is an IoT Sensor");
    }
}
