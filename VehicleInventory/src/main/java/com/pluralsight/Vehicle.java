package com.pluralsight;

public class Vehicle {
    // Data Members
    private long vehicleId;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    // Constructor
    public Cars (){
        this.vehicleId = 0;
        this.makeModel = "";
        this.color = "";
        this.odometerReading = 0;
        this.price = 0;
    }

    // Get Methods
    public long getVehicleId() {
        return this.vehicleId;
    }
    public String getMakeModel() {
        return this.makeModel;
    }
    public String getColor() {
        return this.color;
    }
    public int getOdometerReading() {
        return this.odometerReading;
    }
    public float getPrice() {
        return this.price;
    }

    // Set Methods


    public void setVehicleId(long vehicleId) {
        this.vehicleId = vehicleId;
    }
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }
    public void setPrice(float price) {
        this.price = price;
    }
}
