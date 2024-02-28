package edu.sdccd.cisc191;

public class Vehicle {
    private String manufacturerName;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    private Option[] options;

    public Vehicle(String theManufacturerName, int theMilesOnVehicle, int thePrice, int theNumberOfSeats, Option[] options) {
        manufacturerName = theManufacturerName;
        milesOnVehicle = theMilesOnVehicle;
        price = thePrice;
        numberOfSeats = theNumberOfSeats;
        this.options = options;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getMilesOnVehicle() {
        return milesOnVehicle;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Option[] getOptions() {
        return options;
    }
}