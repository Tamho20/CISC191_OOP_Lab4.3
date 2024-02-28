package edu.sdccd.cisc191;

public class GasCar extends Car implements Combustible {
    private int fuelLevel;

    public GasCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] option, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, option, numberOfDoors);
    }

    public int getNumberOfDoors() {
        return super.getNumberOfDoors();
    }

    public int getFuelLevel() {
        return this.fuelLevel;
    }

    public void tankUp() {
        this.fuelLevel = 100;
    }
}
