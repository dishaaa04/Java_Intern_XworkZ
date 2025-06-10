package com.xworkz.staticapp.dto;



import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;

public class DeathCertificateDTO implements Serializable {
    private String name;
    private String cause;
    private LocalDate date;
    private LocalTime time;
    private int ageAtDeath;
    private String certifiedBy;
    private String hospitalName;
    private String mannerOfDeath;
    private String gender;
    private String marks;

    public DeathCertificateDTO() {}

    public DeathCertificateDTO(String name, String cause, LocalDate date, LocalTime time,
                               int ageAtDeath, String certifiedBy, String hospitalName,
                               String mannerOfDeath, String gender, String marks) {
        this.name = name;
        this.cause = cause;
        this.date = date;
        this.time = time;
        this.ageAtDeath = ageAtDeath;
        this.certifiedBy = certifiedBy;
        this.hospitalName = hospitalName;
        this.mannerOfDeath = mannerOfDeath;
        this.gender = gender;
        this.marks = marks;
    }

    // Getters and Setters
    public String getName() { return name; }
    public String getCause() { return cause; }
    public LocalDate getDate() { return date; }
    public LocalTime getTime() { return time; }
    public int getAgeAtDeath() { return ageAtDeath; }
    public String getCertifiedBy() { return certifiedBy; }
    public String getHospitalName() { return hospitalName; }
    public String getMannerOfDeath() { return mannerOfDeath; }
    public String getGender() { return gender; }
    public String getMarks() { return marks; }

    public void setName(String name) { this.name = name; }
    public void setCause(String cause) { this.cause = cause; }
    public void setDate(LocalDate date) { this.date = date; }
    public void setTime(LocalTime time) { this.time = time; }
    public void setAgeAtDeath(int ageAtDeath) { this.ageAtDeath = ageAtDeath; }
    public void setCertifiedBy(String certifiedBy) { this.certifiedBy = certifiedBy; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }
    public void setMannerOfDeath(String mannerOfDeath) { this.mannerOfDeath = mannerOfDeath; }
    public void setGender(String gender) { this.gender = gender; }
    public void setMarks(String marks) { this.marks = marks; }

    @Override
    public String toString() {
        return "DeathCertificateDTO{" +
                "name='" + name + '\'' +
                ", cause='" + cause + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", ageAtDeath=" + ageAtDeath +
                ", certifiedBy='" + certifiedBy + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", mannerOfDeath='" + mannerOfDeath + '\'' +
                ", gender='" + gender + '\'' +
                ", marks='" + marks + '\'' +
                '}';
    }
}
