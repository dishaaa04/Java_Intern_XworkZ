package com.xworkz.cert.dto;


import java.io.Serializable;
import java.time.LocalDate;

public class MarriageCertificateDTO implements Serializable {
    private String groomName;
    private String brideName;
    private String location;
    private String address;
    private String religion;
    private LocalDate date;
    private String witness1;
    private String witness2;
    private String officerPresent;

    public MarriageCertificateDTO() {}

    public MarriageCertificateDTO(String groomName, String brideName, String location,
                                  String address, String religion, LocalDate date,
                                  String witness1, String witness2, String officerPresent) {
        this.groomName = groomName;
        this.brideName = brideName;
        this.location = location;
        this.address = address;
        this.religion = religion;
        this.date = date;
        this.witness1 = witness1;
        this.witness2 = witness2;
        this.officerPresent = officerPresent;
    }

    // Getters and Setters
    public String getGroomName() { return groomName; }
    public String getBrideName() { return brideName; }
    public String getLocation() { return location; }
    public String getAddress() { return address; }
    public String getReligion() { return religion; }
    public LocalDate getDate() { return date; }
    public String getWitness1() { return witness1; }
    public String getWitness2() { return witness2; }
    public String getOfficerPresent() { return officerPresent; }

    public void setGroomName(String groomName) { this.groomName = groomName; }
    public void setBrideName(String brideName) { this.brideName = brideName; }
    public void setLocation(String location) { this.location = location; }
    public void setAddress(String address) { this.address = address; }
    public void setReligion(String religion) { this.religion = religion; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setWitness1(String witness1) { this.witness1 = witness1; }
    public void setWitness2(String witness2) { this.witness2 = witness2; }
    public void setOfficerPresent(String officerPresent) { this.officerPresent = officerPresent; }

    @Override
    public String toString() {
        return "MarriageCertificateDTO{" +
                "groomName='" + groomName + '\'' +
                ", brideName='" + brideName + '\'' +
                ", location='" + location + '\'' +
                ", address='" + address + '\'' +
                ", religion='" + religion + '\'' +
                ", date=" + date +
                ", witness1='" + witness1 + '\'' +
                ", witness2='" + witness2 + '\'' +
                ", officerPresent='" + officerPresent + '\'' +
                '}';
    }
}