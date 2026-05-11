package com.plularsight;

public class Moped extends Vehicle {

    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        // Java requires us to call the parent constructor first because
        // Vehicle no longer has a default no-arg constructor.
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }
}