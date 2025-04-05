package com.xworkz.inheritanceDemo;

public class Kitchen extends LidarSensor {

    @Override
    public void measureDistance() {
        System.out.println("Kitchen LidarSensor measures distance for object tracking in the kitchen");
    }

    @Override
    public void detectObjects() {
        System.out.println("Kitchen LidarSensor detects kitchen objects such as appliances or ingredients");
    }

    @Override
    public void scanArea() {
        System.out.println("Kitchen LidarSensor scans the kitchen area for mapping and obstacle detection");
    }

    @Override
    public void calibrateSensor() {
        System.out.println("Kitchen LidarSensor calibrates for precise kitchen measurements");
    }

    @Override
    public void displayReading() {
        System.out.println("Kitchen LidarSensor displays the detected object and distance data");
    }

    public void controlAppliance() {
        System.out.println("Kitchen LidarSensor controls kitchen appliances based on object tracking");
    }

    public void detectCookingStatus() {
        System.out.println("Kitchen LidarSensor detects the cooking status of food items");
    }

    public void monitorIngredients() {
        System.out.println("Kitchen LidarSensor monitors ingredients and supplies in the kitchen");
    }
}
