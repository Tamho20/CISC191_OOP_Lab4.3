package edu.sdccd.cisc191;

public class HybridCar implements Combustible, Chargeable{
    private int fuelLevel;
    private int batteryCharge;

    public HybridCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] option, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, option, numberOfDoors);
    }

    public int getNumberOfDoors() {
        return super.getNumberOfDoors();
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void chargeUp() {
        batteryCharge = 100;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void tankUp() {
        fuelLevel = 100;
    }
}
