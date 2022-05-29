package com.timbuchalka;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;
    }

    public void setColour(String colour) {
        String validColour = colour.toLowerCase();
        if(validColour.equals("blue") || validColour.equals("red")) {
            this.colour = colour;
        } else {
            this.colour = "Unknown";
        }

    }

    public String getColour() {
        return this.colour;
    }

}
