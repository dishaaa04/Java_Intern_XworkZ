package com.xworkz.birthcert.dto;



import java.io.Serializable;

public class BirthDTO implements Serializable {
    private String birthId;
    private String hospitalName;
    private String fatherName;
    private String motherName;
    private String birthDateTime;
    private String doctorName;
    private String nurseName;
    private String hospitalType;

    public BirthDTO() {}

    public BirthDTO(String birthId, String hospitalName, String fatherName, String motherName,
                    String birthDateTime, String doctorName, String nurseName, String hospitalType) {
        this.birthId = birthId;
        this.hospitalName = hospitalName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.birthDateTime = birthDateTime;
        this.doctorName = doctorName;
        this.nurseName = nurseName;
        this.hospitalType = hospitalType;
    }

    public String getBirthId() { return birthId; }
    public String getHospitalName() { return hospitalName; }
    public String getFatherName() { return fatherName; }
    public String getMotherName() { return motherName; }
    public String getBirthDateTime() { return birthDateTime; }
    public String getDoctorName() { return doctorName; }
    public String getNurseName() { return nurseName; }
    public String getHospitalType() { return hospitalType; }

    public void setBirthId(String birthId) { this.birthId = birthId; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }
    public void setFatherName(String fatherName) { this.fatherName = fatherName; }
    public void setMotherName(String motherName) { this.motherName = motherName; }
    public void setBirthDateTime(String birthDateTime) { this.birthDateTime = birthDateTime; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }
    public void setNurseName(String nurseName) { this.nurseName = nurseName; }
    public void setHospitalType(String hospitalType) { this.hospitalType = hospitalType; }

    @Override
    public String toString() {
        return "BirthDTO{" +
                "birthId='" + birthId + '\'' +
                ", hospitalName='" + hospitalName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", motherName='" + motherName + '\'' +
                ", birthDateTime='" + birthDateTime + '\'' +
                ", doctorName='" + doctorName + '\'' +
                ", nurseName='" + nurseName + '\'' +
                ", hospitalType='" + hospitalType + '\'' +
                '}';
    }
}

