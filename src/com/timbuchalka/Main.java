package com.timbuchalka;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("carrera");
        System.out.println("Model is " + porsche.getModel());
        Car Lexus = new Car();
        System.out.println("Colour is " + Lexus.getColour());
        Lexus.setColour("blue");
        System.out.println("Colour is " + Lexus.getColour());
    }
}