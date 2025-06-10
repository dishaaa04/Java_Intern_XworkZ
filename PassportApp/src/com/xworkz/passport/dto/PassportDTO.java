package com.xworkz.passport.dto;


import java.io.Serializable;

public class PassportDTO implements Serializable {
    private String applicantName;
    private String aadharNo;
    private String address;
    private String panNo;
    private String country;
    private String state;
    private String city;
    private String pinCode;
    private String passportType;
    private String paymentReferenceNo;

    public PassportDTO() {}

    public PassportDTO(String applicantName, String aadharNo, String address, String panNo,
                       String country, String state, String city, String pinCode,
                       String passportType, String paymentReferenceNo) {
        this.applicantName = applicantName;
        this.aadharNo = aadharNo;
        this.address = address;
        this.panNo = panNo;
        this.country = country;
        this.state = state;
        this.city = city;
        this.pinCode = pinCode;
        this.passportType = passportType;
        this.paymentReferenceNo = paymentReferenceNo;
    }

    // Getters and Setters
    public String getApplicantName() { return applicantName; }
    public String getAadharNo() { return aadharNo; }
    public String getAddress() { return address; }
    public String getPanNo() { return panNo; }
    public String getCountry() { return country; }
    public String getState() { return state; }
    public String getCity() { return city; }
    public String getPinCode() { return pinCode; }
    public String getPassportType() { return passportType; }
    public String getPaymentReferenceNo() { return paymentReferenceNo; }

    public void setApplicantName(String applicantName) { this.applicantName = applicantName; }
    public void setAadharNo(String aadharNo) { this.aadharNo = aadharNo; }
    public void setAddress(String address) { this.address = address; }
    public void setPanNo(String panNo) { this.panNo = panNo; }
    public void setCountry(String country) { this.country = country; }
    public void setState(String state) { this.state = state; }
    public void setCity(String city) { this.city = city; }
    public void setPinCode(String pinCode) { this.pinCode = pinCode; }
    public void setPassportType(String passportType) { this.passportType = passportType; }
    public void setPaymentReferenceNo(String paymentReferenceNo) { this.paymentReferenceNo = paymentReferenceNo; }

    @Override
    public String toString() {
        return "PassportDTO{" +
                "applicantName='" + applicantName + '\'' +
                ", aadharNo='" + aadharNo + '\'' +
                ", address='" + address + '\'' +
                ", panNo='" + panNo + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", pinCode='" + pinCode + '\'' +
                ", passportType='" + passportType + '\'' +
                ", paymentReferenceNo='" + paymentReferenceNo + '\'' +
                '}';
    }
}