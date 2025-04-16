package com.pluralsight;

public class CellPhone {
    /* serialNumber (ex: 1000000 - 9999999)
- model (ex: iPhone X)
- carrier (ex: AT&T)
- phoneNumber (ex: 800-555-5555)
- owner (ex: Dana Wyatt)*/

    private double serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // creating parameterless constructor w these default values
    /* serialNumber = 0
- model = ""
- carrier = ""
- phoneNumber = ""
- owner = "" */
    public CellPhone () {
        this.serialNumber = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNumber = "";
        this.owner = "";
    }

    public double getSerialNumber() {
        return this.serialNumber;
    }

    public String getModel() {
        return this.model;
    }

    public String getCarrier() {
        return this.carrier;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setSerialNumber(double serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

}
