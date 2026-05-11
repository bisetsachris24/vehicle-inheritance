package com.plularsight;

//* Vehicle is the parent class for all rideable / drivable things in the game.
 //* It holds every property and behavior that ALL vehicles share, so child
 //* classes don't have to redeclare them.

public class Vehicle {

    //  Shared properties (kept private so children must use getters/setters) ---
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;


  //* Takes parameters for every private field on Vehicle so that subclasses
    //     * can pass shared data up via super(...).


    public Vehicle(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        this.color = color;
        this.numberOfPassengers = numberOfPassengers;
        this.cargoCapacity = cargoCapacity;
        this.fuelCapacity = fuelCapacity;
    }

    // --- Getters & setters for every field ---

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }


    public String describe() {
        return String.format(
                "%s vehicle | passengers: %d | cargo: %d | fuel: %d",
                color, numberOfPassengers, cargoCapacity, fuelCapacity
        );
    }
}
