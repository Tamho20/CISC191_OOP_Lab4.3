package edu.sdccd.cisc191;

public class SportsUtilityVehicle extends Vehicle {
    private int maxTowingWeight;

    public SportsUtilityVehicle(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] option, int theMaxTowingWeight) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, option);
        maxTowingWeight = theMaxTowingWeight;
    }
    public int getMaxTowingWeight(){
        return maxTowingWeight;
    }
}