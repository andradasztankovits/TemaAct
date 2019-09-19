package com.fastrackit;

public class CertificatDeCasatorie extends Act {

    String partnerName;
//constructor
    public CertificatDeCasatorie(String partnerName){
        this.partnerName = partnerName;
    }
    public CertificatDeCasatorie(){

    }
    public String getPartnerName() {
        return partnerName;
    }

    public void setPartnerName(String partnerName) {
        this.partnerName = partnerName;
    }
}
