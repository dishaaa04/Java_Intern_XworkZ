package com.xworkz.dto;

public class WeatherDTO {
    private String location;
    private String capturedBy;
    private String temperature;
    private String recordedDate;

    public WeatherDTO(String location, String capturedBy, String temperature, String recordedDate) {
        this.location = location;
        this.capturedBy = capturedBy;
        this.temperature = temperature;
        this.recordedDate = recordedDate;
    }

    public String getLocation() {
        return location;
    }

    public String getCapturedBy() {
        return capturedBy;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getRecordedDate() {
        return recordedDate;
    }
}
