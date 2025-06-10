package com.xworkz.drive.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class DrivingLicenseDTO implements Serializable {
    private String name;
    private String address;
    private String mobile;
    private LocalDate appliedDate;
    private String vehicleType;

    public DrivingLicenseDTO() {}

    public DrivingLicenseDTO(String name, String address, String mobile,
                             LocalDate appliedDate, String vehicleType) {
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.appliedDate = appliedDate;
        this.vehicleType = vehicleType;
    }

    // Getters and Setters
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getMobile() { return mobile; }
    public LocalDate getAppliedDate() { return appliedDate; }
    public String getVehicleType() { return vehicleType; }

    public void setName(String name) { this.name = name; }
    public void setAddress(String address) { this.address = address; }
    public void setMobile(String mobile) { this.mobile = mobile; }
    public void setAppliedDate(LocalDate appliedDate) { this.appliedDate = appliedDate; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    @Override
    public String toString() {
        return "DrivingLicenseDTO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mobile='" + mobile + '\'' +
                ", appliedDate=" + appliedDate +
                ", vehicleType='" + vehicleType + '\'' +
                '}';
    }
}