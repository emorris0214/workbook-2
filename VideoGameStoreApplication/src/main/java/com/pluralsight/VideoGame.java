package com.pluralsight;

public class VideoGame {

    // Properties
    private String name, type;
    private boolean preowned, digital;
    private double price;

    // Constructor (Default Values)
    public VideoGame() {
        this.name = "";
        this.type = "";
        this.preowned = false;
        this.digital = false;
        this.price = 0.0;
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public boolean isPreowned() {
        return this.preowned;
    }

    public boolean isDigital() {
        return this.digital;
    }

    public double getPrice() {
        return this.price;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPreowned(boolean preowned) {
        this.preowned = preowned;
    }

    public void setDigital(boolean digital) {
        this.digital = digital;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
