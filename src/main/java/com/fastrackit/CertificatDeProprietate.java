package com.fastrackit;

public class CertificatDeProprietate extends Act {

    int area;
    String property;
//constructor
    public CertificatDeProprietate(int area){
        this.area = area;
    }
    public CertificatDeProprietate(){

    }
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}
