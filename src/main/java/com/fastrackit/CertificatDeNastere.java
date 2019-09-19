package com.fastrackit;

public class CertificatDeNastere extends Act {

    String fatherName;
    String motherName;
    String citizenship;
//constructor
    public CertificatDeNastere(String fatherName){
        this.fatherName=fatherName;
    }
    public CertificatDeNastere(){

    }
    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getCitizenship() {
        return citizenship;
    }

    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
}
