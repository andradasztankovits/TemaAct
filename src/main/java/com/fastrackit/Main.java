package com.fastrackit;

public class Main {
    public static void main(String[] args) {
CertificatDeNastere firstCertificatDeNastere= new CertificatDeNastere();
firstCertificatDeNastere.setCitizenship("romana");
firstCertificatDeNastere.setMotherName("maria");
firstCertificatDeNastere.setFatherName("mircea");
firstCertificatDeNastere.setDateOfIssue("5 oct 2015");
firstCertificatDeNastere.setIssuingInstitution("primarie");
firstCertificatDeNastere.setOwner("mihai");
firstCertificatDeNastere.setYears(2009);
CertificatDeNastere secondCertificatDeNastere = new CertificatDeNastere();
secondCertificatDeNastere.setOwner("adi");
secondCertificatDeNastere.setIssuingInstitution("primarie");
secondCertificatDeNastere.setDateOfIssue("6 april");
secondCertificatDeNastere.setFatherName("ciprian");
secondCertificatDeNastere.setMotherName("ioana");
secondCertificatDeNastere.setCitizenship("romana");
secondCertificatDeNastere.setYears(2011);

CertificatDeCasatorie firstCertificatDeCasatorie = new CertificatDeCasatorie();
firstCertificatDeCasatorie.setPartnerName("ion");
firstCertificatDeCasatorie.setDateOfIssue("12 sep 2017");
firstCertificatDeCasatorie.setIssuingInstitution("primarie");
firstCertificatDeCasatorie.setOwner("paul");
firstCertificatDeCasatorie.setYears(2012);
CertificatDeCasatorie secondCertificatDeCasatorie = new CertificatDeCasatorie();
secondCertificatDeCasatorie.setYears(2010);
secondCertificatDeCasatorie.setOwner("ovi");
secondCertificatDeCasatorie.setIssuingInstitution("primarie");
secondCertificatDeCasatorie.setDateOfIssue("23 mai");
secondCertificatDeCasatorie.setPartnerName("serban");
    }
}
