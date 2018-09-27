package org.java.entity;

public class TranBranch {
    private String bId;

    private String bName;

    private String bPhone;

    private String bType;

    private String bProvince;

    private String bCity;

    private String bPlace;

    private String bPeoson;

    private String bTelone;

    private String bTeltwo;

    private Double bX;

    private Double bY;

    public String getbId() {
        return bId;
    }

    public void setbId(String bId) {
        this.bId = bId == null ? null : bId.trim();
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName == null ? null : bName.trim();
    }

    public String getbPhone() {
        return bPhone;
    }

    public void setbPhone(String bPhone) {
        this.bPhone = bPhone == null ? null : bPhone.trim();
    }

    public String getbType() {
        return bType;
    }

    public void setbType(String bType) {
        this.bType = bType == null ? null : bType.trim();
    }

    public String getbProvince() {
        return bProvince;
    }

    public void setbProvince(String bProvince) {
        this.bProvince = bProvince == null ? null : bProvince.trim();
    }

    public String getbCity() {
        return bCity;
    }

    public void setbCity(String bCity) {
        this.bCity = bCity == null ? null : bCity.trim();
    }

    public String getbPlace() {
        return bPlace;
    }

    public void setbPlace(String bPlace) {
        this.bPlace = bPlace == null ? null : bPlace.trim();
    }

    public String getbPeoson() {
        return bPeoson;
    }

    public void setbPeoson(String bPeoson) {
        this.bPeoson = bPeoson == null ? null : bPeoson.trim();
    }

    public String getbTelone() {
        return bTelone;
    }

    public void setbTelone(String bTelone) {
        this.bTelone = bTelone == null ? null : bTelone.trim();
    }

    public String getbTeltwo() {
        return bTeltwo;
    }

    public void setbTeltwo(String bTeltwo) {
        this.bTeltwo = bTeltwo == null ? null : bTeltwo.trim();
    }

    public Double getbX() {
        return bX;
    }

    public void setbX(Double bX) {
        this.bX = bX;
    }

    public Double getbY() {
        return bY;
    }

    public void setbY(Double bY) {
        this.bY = bY;
    }

    @Override
    public String toString() {
        return "TranBranch{" +
                "bId='" + bId + '\'' +
                ", bName='" + bName + '\'' +
                ", bPhone='" + bPhone + '\'' +
                ", bType='" + bType + '\'' +
                ", bProvince='" + bProvince + '\'' +
                ", bCity='" + bCity + '\'' +
                ", bPlace='" + bPlace + '\'' +
                ", bPeoson='" + bPeoson + '\'' +
                ", bTelone='" + bTelone + '\'' +
                ", bTeltwo='" + bTeltwo + '\'' +
                ", bX=" + bX +
                ", bY=" + bY +
                '}';
    }
}