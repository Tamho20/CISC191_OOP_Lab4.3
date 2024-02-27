package edu.sdccd.cisc191;

public class Car extends Vehicle{
    private int numberOfDoors;

    public Car(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] option, int theNumberOfDoors) {
        super(manufacturerName, milesOnVehicle, price,numberOfSeats,option);
        numberOfDoors = theNumberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }
}